package com.formation.testdriver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.formation.config.SpringConfig;
import com.formation.dao.CustomerRepository;
import com.formation.entity.Customer;

public class MainDriver {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		
//		ProductRepository productRepository =  (ProductRepository) ctx.getBean("productRepositoryImpl");
//
//		Product iphone = new Product("P123", "IPhone 5 S", 500);
//		iphone.setDescription("Apple iPhone 5s smartphone with 4.00 inch ...");
//		iphone.setCategory("Phone");
//		iphone.setManufacturer("AppleLesVoleurs");
//		iphone.setUnitsInStock(1000);
//
//		Product laptop = new Product("P125", "Dell Inspiration", 700);
//		laptop.setDescription("Dell Inspiration with 14 inch ...");
//		laptop.setCategory("Laptop");
//		laptop.setManufacturer("Dell");
//		laptop.setUnitsInStock(1000);
//
//		Product tablet = new Product("P165", "Nexus 7", 200);
//		tablet.setDescription("Google nexus with a quadracore ...");
//		tablet.setCategory("Tablet");
//		tablet.setManufacturer("Google");
//		tablet.setUnitsInStock(1000);
//		
//		productRepository.insertProduct(iphone);
//		productRepository.insertProduct(laptop);
//		productRepository.insertProduct(tablet);
		
		CustomerRepository customerRepository =  (CustomerRepository) ctx.getBean("customerRepositoryImpl");
		
		Customer customer1 = new Customer("6, rue des mouettes", "Jean Louis", 2);
		Customer customer2 = new Customer("8, rue des champignons", "Bob", 3);
		Customer customer3 = new Customer("102, rue des marguerites", "Reine Elisabeth", 32);
		
		customerRepository.insertCustomer(customer1);
		customerRepository.insertCustomer(customer2);
		customerRepository.insertCustomer(customer3);
		
	}

}
