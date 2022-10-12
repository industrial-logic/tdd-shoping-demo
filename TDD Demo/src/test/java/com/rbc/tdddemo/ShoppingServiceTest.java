package com.rbc.tdddemo;

import com.rbc.tdddemo.model.Item;
import com.rbc.tdddemo.model.Order;
import com.rbc.tdddemo.repository.ShoppingRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ShoppingServiceTest {

    @Mock
    ShoppingRepository repository;

    @InjectMocks
    private ShoppingService shoppingService = new ShoppingService();
    private List<Item> items;


    @Test
    public void testOrderTotal() {
        Item item2 = new Item(40.00);
        Item item1 = new Item(10.25);
        items = Arrays.asList(item1, item2);
        assertThat(50.25).isEqualTo(shoppingService.getOrderTotal(items));
    }

    @Test
    public void shouldAddItemToOrder() {
        when(repository.getOrder(anyInt())).thenReturn(new Order(Arrays.asList(new Item(15.00))));
        assertThat(shoppingService.getOrderItems(0)).contains(new Item(15.00));
    }
}
