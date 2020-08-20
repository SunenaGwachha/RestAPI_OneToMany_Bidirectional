package com.example.execute.api.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.execute.api.Repository.CustomerRepository;
import com.example.execute.api.model.Customer;
import com.example.execute.api.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepository customerRepository;
	
	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	@Override
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}
	@Override
	public Customer findCustomerById(Integer customerId) {
		// TODO Auto-generated method stub
		return customerRepository.findById(customerId).orElse(null);
	}

}
