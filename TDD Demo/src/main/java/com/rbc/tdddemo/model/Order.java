package com.rbc.tdddemo.model;

import java.util.List;

public class Order {

    public Order(List<Item> items) {
        this.items = items;
    }

    private List<Item> items;
    public List<Item> getItems() {
        return items;
    }
}
