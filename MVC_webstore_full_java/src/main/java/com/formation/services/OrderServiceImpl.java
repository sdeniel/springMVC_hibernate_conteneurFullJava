package com.formation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.dao.ProductRepository;
import com.formation.entity.Product;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private ProductRepository productRepository; 
	
	@Override
	public void processOrder(int productId, int count) {
		Product productById = productRepository.getProductById(productId);

		if(productById.getUnitsInStock() < count) {
			throw new IllegalArgumentException("Out of stock. Available units in stock : " + productById.getUnitsInStock());
		}
		
		//System.out.println(count + " " + productById.getUnitsInStock());
		productById.setUnitsInStock(productById.getUnitsInStock() - count);
		productRepository.insertProduct(productById);
		//System.out.println(" Puis : " + productById.getUnitsInStock());
	}

}
