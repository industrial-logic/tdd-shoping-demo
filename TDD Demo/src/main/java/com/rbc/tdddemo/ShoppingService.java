package com.rbc.tdddemo;


import com.rbc.tdddemo.model.Item;
import com.rbc.tdddemo.model.Order;
import com.rbc.tdddemo.repository.ShoppingRepository;

import java.util.List;

public class ShoppingService {

    private ShoppingRepository shoppingRepository;

    public double getOrderTotal(List<Item> items) {
        return items.stream().map(item -> item.getPrice())
                .reduce(0.0, Double::sum);
    }

    public List<Item> getOrderItems(Integer orderNumber) {
         Order order = shoppingRepository.getOrder(orderNumber);
         return order.getItems();
    }
}
