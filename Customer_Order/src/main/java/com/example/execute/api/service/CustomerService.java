package com.example.execute.api.service;

import java.util.List;

import com.example.execute.api.model.Customer;

public interface CustomerService {

	
	Customer addCustomer(Customer customer);

	List<Customer> getCustomer();

	Customer findCustomerById(Integer customerId);

}
