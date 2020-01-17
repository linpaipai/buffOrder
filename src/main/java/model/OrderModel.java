package model;

import java.util.List;

public class OrderModel {
    String appid;
    List<String> buy_orders;


    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public List<String> getBuy_orders() {
        return buy_orders;
    }

    public void setBuy_orders(List<String> buy_orders) {
        this.buy_orders = buy_orders;
    }


}
