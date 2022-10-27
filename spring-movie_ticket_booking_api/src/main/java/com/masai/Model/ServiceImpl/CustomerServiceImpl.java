package com.masai.Model.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Model.Customer;
import com.masai.Repository.CustomerRepository;
import com.masai.Service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	
	
	
	@Autowired
	private CustomerRepository repo;

	@Override
	public Customer addCustomer(Customer customer) {
		
		return repo.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return repo.save(customer);
	}

	@Override
	public Customer deleteCustomer(Customer customer) {
		repo.delete(customer);
		return customer;
	}

	@Override
	public Customer viewCustomer(int custId) {
		return repo.findById(custId).orElse(new Customer());
	}

	@Override
	public List<Customer> viewAllCustomers() {
		
		return repo.findAll();
	}
	

}
