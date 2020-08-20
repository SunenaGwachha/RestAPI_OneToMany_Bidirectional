package com.example.execute.api.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.execute.api.Repository.OrderRepository;
import com.example.execute.api.model.Order;
import com.example.execute.api.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	
	@Autowired
	OrderRepository orderRepository;
	
	@Override
	public Order addOrder(Order order) {
		// TODO Auto-generated method stub
		return orderRepository.save(order);
	}

	@Override
	public List<Order> getOrder() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

	@Override
	public Order findOrderById(Integer orderId) {
		
		return orderRepository.findById(orderId).orElse(null);
	}

	@Override
	@Transactional
	public void deleteOrderById(Integer orderId) {
		
		 orderRepository.deleteById(orderId);
	
		
	}

	
}
