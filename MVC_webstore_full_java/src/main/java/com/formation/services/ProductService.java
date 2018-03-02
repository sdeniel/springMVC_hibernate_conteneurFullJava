package com.formation.services;

import java.util.List;

import com.formation.entity.Product;

public interface ProductService {

	List<Product> getAllProducts();
	
	void addProduct(Product product);
}
