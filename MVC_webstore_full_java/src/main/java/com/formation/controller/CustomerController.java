package com.formation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.formation.entity.Customer;
import com.formation.services.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/customers")
	public String list(Model model) {

		List<Customer> customerListe = customerService.getAllCustomer();
		model.addAttribute("customersList", customerListe);
		return "customers";
	}
}
