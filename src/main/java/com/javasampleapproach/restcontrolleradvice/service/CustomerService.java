package com.javasampleapproach.restcontrolleradvice.service;

import java.util.HashMap;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.javasampleapproach.restcontrolleradvice.model.Customer;

@Service
public class CustomerService {

	HashMap<String, Customer> custStorage = new HashMap<String, Customer>();

	@PostConstruct
	void init() {
		Customer jack = new Customer("Jack", 20);
		Customer peter = new Customer("Peter", 30);
		custStorage.put("Jack", jack);
		custStorage.put("Peter", peter);
	}

	public Customer findCustomerByName(String name) {
		return custStorage.get(name);
	}
}
