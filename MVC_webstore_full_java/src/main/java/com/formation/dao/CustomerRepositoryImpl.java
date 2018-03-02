package com.formation.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.formation.entity.Customer;

@Repository
@Transactional
public class CustomerRepositoryImpl implements CustomerRepository {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getAllCustomers() {
		List<Customer> customers = sessionFactory.getCurrentSession().createQuery("FROM Customer customer").list();
		return customers;
	}

	@Override
	public void insertCustomer(Customer customer) {
		sessionFactory.getCurrentSession().saveOrUpdate(customer);
		
	}

	@Override
	public Customer getCustomerById(int customerId) {
		return sessionFactory.getCurrentSession().get(Customer.class, customerId);
	}

	@Override
	public void deleteCustomer(int customerId) {
		sessionFactory.getCurrentSession().delete(customerId);
		
	}

}
