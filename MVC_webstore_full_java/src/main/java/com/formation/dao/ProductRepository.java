package com.formation.dao;

import java.util.List;

import com.formation.entity.Product;

public interface ProductRepository {
	

	void insertProduct(Product product);

	Product getProductById(int product);

	List<Product> getAllProducts();

	void deleteProduct(int productId);
}
