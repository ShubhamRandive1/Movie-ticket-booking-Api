package com.masai.Model.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Model.Customer;
import com.masai.Service.CustomerService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	
	@GetMapping("/customer/{id}")
	public Customer getCustomerById(@PathVariable("id") Integer id) {
		
		return service.viewCustomer(id);
	}
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomers() {
		
		return service.viewAllCustomers();
	}
	
	@PostMapping("/customer")
	public Customer addCustomer(@RequestBody Customer customer) {
		
		return service.addCustomer(customer);
	}
	
	@PutMapping("/customer")
	public Customer updateCustomer(@RequestBody Customer customer) {
		
		return service.updateCustomer(customer);
	}
	
	@DeleteMapping("/customer")
	public Customer deleteCustomer(@RequestBody Customer customer) {
		
		return service.deleteCustomer(customer);
	}
	

}
