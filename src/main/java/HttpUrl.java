public class HttpUrl {
    //登录地址
    public static String LoginUrl = "https://buff.163.com/market/goods?goods_id=759093&from=market#tab=selling";
    //在售物品
    public static String sellUrl = "https://api.buff.163.com/api/market/sell_order/on_sale?appid=570&mode=2%2C5&page_num=1&page_size=1";
    //我的求购列表
    public static String purchaseUrl = "https://api.buff.163.com/api/market/buy_order/wait_supply?appid=570&page_num=1&page_size=60";
    //确认终止求购的接口
    public static  String confirmGoodCancelInfo = "https://api.buff.163.com/api/market/buy_order/cancel";
    //发布求购接口
    public static  String postBuyUrl = "https://api.buff.163.com/api/market/buy_order/create";
    //物品详情
    public static  String goodDetailInfo = "https://api.buff.163.com/api/market/goods/info?game=dota2&";
    //成交记录的数据
    public static  String transRecordUrl = "https://api.buff.163.com/api/market/goods/bill_order?appid=570&goods_id=";

}
