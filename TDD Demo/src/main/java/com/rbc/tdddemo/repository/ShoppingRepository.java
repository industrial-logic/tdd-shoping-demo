package com.rbc.tdddemo.repository;


import com.rbc.tdddemo.model.Order;

public interface ShoppingRepository {
    Order getOrder(Integer orderNumber);
}
