package com.example.execute.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.execute.api.model.Order;
import com.example.execute.api.service.OrderService;


@RestController
public class OrderController {
	
    @Autowired
    private OrderService orderService;

    @PostMapping(value = "/addOrder")
    public Order addAddress(@RequestBody Order order){
        return orderService.addOrder(order);
    }

    @GetMapping(value = "/getOrder")
    public List<Order> getOrder(){
        return orderService.getOrder();
    }    

	@DeleteMapping("/deleteOrderById/{orderId}")
    public ResponseEntity<?> deleteOrderById( @PathVariable Integer orderId ) {   	
		
    	orderService.deleteOrderById(orderId);
    	return ResponseEntity.ok("DELETED");    	
    }

    @GetMapping("/getOrderId/{orderId}")
    public Order getOrderById( @PathVariable Integer orderId ) {    	
    	return orderService.findOrderById(orderId);    	
    }     

}
