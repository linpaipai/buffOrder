import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sun.prism.impl.Disposer;
import itf.GetData;
import model.*;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import utils.BigDecimalUtil;
import utils.Compare;
import utils.TextUtlis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EnterClass {
    public static void main(String[] args) {
        getMyPurchaseData();
    }
    //请求求购列表数据
    public static void getMyPurchaseData() {
        new CommonHttp().getHttpData(HttpUrl.purchaseUrl, new GetData() {
            @Override
            public void getData(String response) {
                PurchaseModel purchaseBean = null;
                try {
                    System.out.println(TextUtlis.decode(response));
                    purchaseBean = new Gson().fromJson(response, new TypeToken<PurchaseModel>() {
                    }.getType());
                } catch (Exception e) {
                    System.out.println("数据解析异常");
                    e.printStackTrace();
                }
                if (purchaseBean == null) {
                    System.out.println("求购列表为空==============");
                    return;
                }
                //求购物品信息
                List<PurchaseModel.DataBean.ItemsBean> items = purchaseBean.getData().getItems();
                for (PurchaseModel.DataBean.ItemsBean itemsBean : items) {
                    //记录求购物品信息  物品id和求购最高价
                    GoodModel goodModel = new GoodModel();
                    //物品id
                    goodModel.setGoods_id(itemsBean.getGoods_id());
                    //appid
                    goodModel.setAppid(itemsBean.getAppid() + "");
                    //我的求购价
                    goodModel.setMyOrderPrice(itemsBean.getPrice());
                    //设置求购订单id 作为之后取消订单用
                    goodModel.setOrderId(itemsBean.getId());
                    //请求物品信息
                    getTransRecord(goodModel);
                }
            }
        });
    }

    //获取饰品成交记录的中位数
    public static void getTransRecord(GoodModel goodModel) {
        String httpUrl = HttpUrl.transRecordUrl + goodModel.getGoods_id();
        new CommonHttp().getHttpData(httpUrl, new GetData() {
            @Override
            public void getData(String response) {
                RecordBean recordBean = null;
                try {
                    System.out.println(TextUtlis.decode(response));
                    recordBean = new Gson().fromJson(response, new TypeToken<RecordBean>() {
                    }.getType());
                } catch (Exception e) {
                    System.out.println("数据解析异常");
                    e.printStackTrace();
                }
                if (recordBean == null) {
                    System.out.println("求购列表为空==============");
                    return;
                }
                //获取成交记录的价格
                List<RecordBean.DataBean.ItemsBean> itemsBeans = recordBean.getData().getItems();
                //无成交记录
                if (itemsBeans == null || itemsBeans.size() == 0) {
//                    <是否取消求购>
                    postOrderCancel(goodModel);
                    System.out.println("========成交记录为空");
                    return;
                }
                Double[] itemArray = new Double[itemsBeans.size()];
                int index = -1;
                for (RecordBean.DataBean.ItemsBean itemBean : itemsBeans) {
                    index++;
                    itemArray[index] = Double.valueOf(itemBean.getPrice());
                }
                //获取饰品成交记录的中位数 获取数组的中位数
                double mid_sell_Price = TextUtlis.get_mid_price(itemArray);
//                判断历史成交记录是否为0或者为空
                if (TextUtlis.isEqualZero(mid_sell_Price + "")) {
//                    <是否取消求购>
                    postOrderCancel(goodModel);
                    System.out.println("========历史成交记录为0");
                    return;
                }
                //设置成交记录的中位数
                goodModel.setSell_middle_record(mid_sell_Price + "");
                //请求饰品详情
                postGoodDetail(goodModel);
            }
        });
    }

    //请求物品信息 判断自己的价格是否最低或者是否只有自己在求购
    public static void postGoodDetail(GoodModel goodModel) {
        String httpUrl = HttpUrl.goodDetailInfo + "goods_id=" + goodModel.getGoods_id();
        new CommonHttp().getHttpData(httpUrl, new GetData() {
            @Override
            public void getData(String response) {
                GoodDetailBean goodDetailBean = null;
                try {
                    goodDetailBean = new Gson().fromJson(response, new TypeToken<GoodDetailBean>() {
                    }.getType());
                } catch (Exception e) {
                    System.out.println("数据解析异常");
                    e.printStackTrace();
                }
                if (goodDetailBean == null) {
                    System.out.println("物品详情为空==============");
                }
                //在售最低价
                String sell_min_price = goodDetailBean.getData().getSell_min_price();
                //求购最高价
                String order_max_price = goodDetailBean.getData().getBuy_max_price();
                //参考价
                String sell_reference_price = goodDetailBean.getData().getSell_reference_price();
                //饰品名字
                goodModel.setName(goodDetailBean.getData().getName());
                //在售最低价
                goodModel.setSell_min_price(sell_min_price);
                //求购最高价
                goodModel.setBuy_max_price(order_max_price);
                //我的求购价
                String myPrice = goodModel.getMyOrderPrice();
                //成交记录的中位数
                String record_mid_price = goodModel.getSell_middle_record();
                //有多少人在求购
                int orderNum = goodDetailBean.getData().getBuy_num();

                //先判断自己是否是求购最低价
                boolean isMyLowPrice = false;
                //求购最低价是多少 默认自己为最低价
                String setOrderLowPirce = myPrice;

                //当只有我在求购时  默认我是最低价
                if(orderNum == 1){
                    setOrderLowPirce = myPrice;
                    isMyLowPrice=true;
                }else{
                    //比较我的求购价 和 最低求购价
                    int myPriceAndOrderType = Compare.compare(myPrice,order_max_price);
                    //当我的求购价低于或等于 最低求购价时（有个问题 有人求购的最低价和我一样 我就不会压价 可以判断userid 后期在处理）
                    if(myPriceAndOrderType == 2 || myPriceAndOrderType == 0){
                        setOrderLowPirce = myPrice;
                        isMyLowPrice=true;
                    }else{
                        isMyLowPrice = false;
                        setOrderLowPirce = order_max_price;
                    }
                }

                //需要定位的最低价 比较在售最低价和成交记录的中位数
                String targetLowPrice ="";
                //无人在售时
                if(TextUtlis.isEmpty(sell_min_price)||Compare.compare(sell_min_price,"0")==0){
                    //这里需要在加个阀值  无人在售时  有可能成交历史价很高（不排除特殊宝石）
                    targetLowPrice = record_mid_price;
                }else{
                    int sellAndRecordType = Compare.compare(sell_min_price,record_mid_price);
                    //当在售价低于或等于成交记录中位数时 取在售价
                    if(sellAndRecordType == 2 || sellAndRecordType == 0){
                        targetLowPrice = sell_min_price;
                    }else{
                        targetLowPrice  = record_mid_price;
                    }
                }

                //比较我的求购价格 和 应当低于的求购最低价
                int myPriceAndExpectType = Compare.compare(setOrderLowPirce,targetLowPrice);
                //我的求购价小于或求购最低价 则无需压价
                if(myPriceAndExpectType == 2){
                    if(isMyLowPrice){
                        TextUtlis.print(goodModel,"已是最低价无需压价");
                        return;
                    }else{
                        //这里是否需要设置个阀值 设置价格的区间
                       Double difPrice =  BigDecimalUtil.subtraction(Double.valueOf(setOrderLowPirce),Double.valueOf(myPrice),2);
                       if(Compare.compare(difPrice+"","5") == 2){
                           //取参考价做考虑
                           double price = 0.1;
                           if(Compare.compare(sell_reference_price,"50") == 2){
                               price = BigDecimalUtil.add(Double.valueOf(sell_reference_price),0.1);
                           }else{
                               price = BigDecimalUtil.add(Double.valueOf(sell_reference_price),1);
                           }
                           goodModel.setPrice(price+"");
                           postOrderCancel(goodModel);
                       }else{
                           TextUtlis.print(goodModel,"一次性加价超过5块 放弃此次加价");
                           return;
                       }
                    }
                }else{
                    //我的求购求购价高于期望价
                    if(isMyLowPrice){
//                         <是否取消求购>
                        postOrderCancel(goodModel);
                    }else{
                        //但我不是当前最高求购价时，比较的我求购价和期望求购价
                        //小于 则不取消  大于取消求购
                        if(Compare.compare(myPrice,targetLowPrice)==2){
                            TextUtlis.print(goodModel,"当前求购价高于期望定价,不取消求购也不求求购");
                            return;
                        }else{
//                           <是否取消求购>
                            postOrderCancel(goodModel);
                        }
                    }

                }

            }
        });
    }

    //确认终止求购的接口
    public static void postOrderCancel(GoodModel goodModel) {
//        记录求购物品id
        List<String> orderList = new ArrayList();
        orderList.add(goodModel.getOrderId());
        //创建提交json数据
        OrderModel orderModel = new OrderModel();
        orderModel.setAppid(goodModel.getAppid() + "");
        orderModel.setBuy_orders(orderList);

//        json提交或者表单提交 这里选择json提交 因为要传递数组对象
        String json = new Gson().toJson(orderModel);
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, json);

        new CommonHttp().getHttpData(HttpUrl.confirmGoodCancelInfo, body, new GetData() {
            @Override
            public void getData(String response) {
                try {
                    //求购取消成功
                    if (response.contains("OK")) {
                        System.out.println(TextUtlis.decode(response));
                        if (TextUtlis.isEmpty(goodModel.getAppid())) {
                            System.out.println("appid为空");
                            return;
                        }
                        if (TextUtlis.isEmpty(goodModel.getGoods_id() + "")) {
                            System.out.println("饰品id为空");
                            return;
                        }
                        if(!TextUtlis.isEmpty(goodModel.getPrice())){
                            TextUtlis.print(goodModel,"饰品没有设置最低求购价，不压价");
                            return;
                        }

                        PayModel payModel = new PayModel();
                        payModel.setNum("1");
                        payModel.setAppid(goodModel.getAppid());
                        payModel.setGoods_id(goodModel.getGoods_id() + "");
                        payModel.setPay_method(3);
                        payModel.setPrice(goodModel.getPrice());

                        //json提交或者表单提交 这里选择json提交 因为要传递数组对象
                        String json = new Gson().toJson(payModel);
                        MediaType mediaType = MediaType.parse("application/json");
                        RequestBody body = RequestBody.create(mediaType, json);
                        //发布求购
                        postBuy(body, goodModel);
                    } else {
                        System.out.println("=========求购取消失败 是否重新发起求购");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    //发布求购接口
    public static void postBuy(RequestBody body, GoodModel goodModel) {
        new CommonHttp().getHttpData(HttpUrl.postBuyUrl, body, new GetData() {
            @Override
            public void getData(String response) {
                TextUtlis.print(goodModel,"==========修改价格成功");
            }

        });
    }
}
