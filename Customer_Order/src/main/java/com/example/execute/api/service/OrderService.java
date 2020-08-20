package com.example.execute.api.service;

import java.util.List;

import com.example.execute.api.model.Customer;
import com.example.execute.api.model.Order;

public interface OrderService {

	Order addOrder(Order order);

	List<Order> getOrder();

	Order findOrderById(Integer orderId);

	void deleteOrderById(Integer orderId);

}
