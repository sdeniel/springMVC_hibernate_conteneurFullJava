package com.formation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int customerId;
	private String address;
	private String name;
	private int noOfOrdersMade;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String address, String name, int noOfOrdersMade) {
		super();
		this.address = address;
		this.name = name;
		this.noOfOrdersMade = noOfOrdersMade;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfOrdersMade() {
		return noOfOrdersMade;
	}

	public void setNoOfOrdersMade(int noOfOrdersMade) {
		this.noOfOrdersMade = noOfOrdersMade;
	}

	public int getCustomerId() {
		return customerId;
	}
	
	

}
