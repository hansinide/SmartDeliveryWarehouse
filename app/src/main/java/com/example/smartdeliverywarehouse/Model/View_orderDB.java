package com.example.smartdeliverywarehouse.Model;

public class View_orderDB {
    String count, item;

    public View_orderDB(String count, String item) {
        this.count = count;
        this.item = item;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
