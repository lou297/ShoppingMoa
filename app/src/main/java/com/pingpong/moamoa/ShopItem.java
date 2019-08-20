package com.pingpong.moamoa;

public class ShopItem {
    private String item_url;
    private double item_regist_date;
    private String item_name;
    private String item_code;
    private String item_price;

    public ShopItem(String item_url, double item_regist_date, String item_name, String item_code, String item_price) {
        this.item_url = item_url;
        this.item_regist_date = item_regist_date;
        this.item_name = item_name;
        this.item_code = item_code;
        this.item_price = item_price;
    }

    public String getItem_url() {
        return item_url;
    }

    public void setItem_url(String item_url) {
        this.item_url = item_url;
    }

    public double getItem_regist_date() {
        return item_regist_date;
    }

    public void setItem_regist_date(double item_regist_date) {
        this.item_regist_date = item_regist_date;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getItem_code() {
        return item_code;
    }

    public void setItem_code(String item_code) {
        this.item_code = item_code;
    }

    public String getItem_price() {
        return item_price;
    }

    public void setItem_price(String item_price) {
        this.item_price = item_price;
    }
}
