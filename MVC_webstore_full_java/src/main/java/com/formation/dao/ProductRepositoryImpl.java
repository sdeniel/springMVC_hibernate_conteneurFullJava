package com.formation.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.formation.entity.Product;

@Repository
@Transactional
public class ProductRepositoryImpl implements ProductRepository {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void insertProduct(Product product) {
		sessionFactory.getCurrentSession().saveOrUpdate(product);
	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> products = sessionFactory.getCurrentSession().createQuery("FROM Product product").list();
		return products;
	}

	@Override
	public Product getProductById(int productId) {
		return sessionFactory.getCurrentSession().get(Product.class, productId);
		
		/*Query<Product> query = sessionFactory.getCurrentSession().createQuery("FROM Product where id = :productId");
		query.setParameter("productId", productId);
		return (Product) query.list().get(0);*/
	}

	@Override
	public void deleteProduct(int productId) {
		sessionFactory.getCurrentSession().delete(productId);

	}

}
