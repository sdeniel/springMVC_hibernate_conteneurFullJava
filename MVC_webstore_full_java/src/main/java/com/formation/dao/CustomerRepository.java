package com.formation.dao;

import java.util.List;

import com.formation.entity.Customer;

public interface CustomerRepository {

	void insertCustomer(Customer customer);

	Customer getCustomerById(int customer);

	List<Customer> getAllCustomers();

	void deleteCustomer(int customerId);
	
}
