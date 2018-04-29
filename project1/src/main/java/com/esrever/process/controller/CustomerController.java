package com.esrever.process.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.esrever.process.model.Customer;
import com.esrever.process.repository.CustomerRepository;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	
	@Autowired
	CustomerRepository customerRepository;
	
	//get all customers
	@GetMapping("/getCustomers")
	@ResponseBody
	public List<Customer> getAllCustomers() {
		List<Customer> customers = new ArrayList<>();
		customers= customerRepository.findAll();
		System.out.println(customers.get(0));
		return customers;
	}
	
	@PostMapping("/createCustomer")
	public Customer createCustomer(@Valid @RequestBody Customer customer) {
		return customerRepository.save(customer);
	}
	
	
	@RequestMapping("/connection")
	public String getConnection() {
		return "Connected";
	}
}
