package com.masai.Service;

import java.util.List;

import com.masai.Model.Customer;

public interface CustomerService {
	
	Customer addCustomer(Customer customer);
	
	Customer updateCustomer(Customer customer);
	
	Customer deleteCustomer(Customer customer);
	
	Customer viewCustomer(int custId);
	
	List<Customer> viewAllCustomers();

}
