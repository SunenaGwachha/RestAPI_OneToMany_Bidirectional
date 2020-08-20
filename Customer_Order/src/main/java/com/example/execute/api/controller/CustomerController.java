package com.example.execute.api.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.execute.api.model.Customer;

import com.example.execute.api.model.Order;
import com.example.execute.api.service.CustomerService;
import com.example.execute.api.service.OrderService;


@RestController
public class CustomerController {
	
    @Autowired
    private CustomerService customerService;
    
    @Autowired
    private OrderService orderService;

    @PostMapping(value = "/addCustomer")
    public Customer addAddress(@RequestBody Customer customer){
        return customerService.addCustomer(customer);
    }


    @GetMapping(value = "/getCustomer")
    public List<Customer> getCustomer(){
        return customerService.getCustomer();
    }

    @GetMapping("/getOrderByCustomerId/{customerId}")
    public List<Order> getOrderByCustomerId( @PathVariable Integer customerId ) {
    	
    	Customer cus=customerService.findCustomerById(customerId);
    	return cus.getOrders();
    	
    }

    @GetMapping("/getCustomerId/{customerId}")
    public Customer getByCustomerId( @PathVariable Integer customerId ) {    	
    	return customerService.findCustomerById(customerId);
    	
    }

}