package com.rbc.tdddemo.model;

import java.util.Objects;

public class Item {
    private Double price;


    public Item(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(price, item.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price);
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
