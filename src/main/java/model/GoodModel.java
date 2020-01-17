package model;

public class GoodModel {
    //饰品id
    int goods_id;
    //求购最高价
    String buy_max_price;
    String appid;
    //饰品名字
    String name;
    //我的求购价
    String myOrderPrice;
    //在售最低价
    String sell_min_price;
    //求购饰品的订单id
    String orderId;
    //成交记录的中位数
    String sell_middle_record;
    //设置的求购价
    String price;
    //参考价 根基这个设置加价规则 <50 +0.1 >50 +1
    String sell_reference_price;

    public String getSell_refrence_price() {
        return sell_reference_price;
    }
    public void setSell_refrence_price(String sell_refrence_price) {
        this.sell_reference_price = sell_refrence_price;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


    public String getSell_middle_record() {
        return sell_middle_record;
    }

    public void setSell_middle_record(String sell_middle_record) {
        this.sell_middle_record = sell_middle_record;
    }



    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getSell_min_price() {
        return sell_min_price;
    }
    public void setSell_min_price(String sell_min_price) {
        this.sell_min_price = sell_min_price;
    }
    public String getMyOrderPrice() {
        return myOrderPrice;
    }
    public void setMyOrderPrice(String myOrderPrice) {
        this.myOrderPrice = myOrderPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }





    public int getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(int goods_id) {
        this.goods_id = goods_id;
    }

    public String getBuy_max_price() {
        return buy_max_price;
    }

    public void setBuy_max_price(String buy_max_price) {
        this.buy_max_price = buy_max_price;
    }



}

