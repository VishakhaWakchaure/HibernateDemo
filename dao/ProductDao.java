package com.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Product;

public class ProductDao {
	//private static final Object Product = null;
	EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vishakha");
	EntityManager entityManager= entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	//delete
	public boolean deleteProductById(int id) {
		Product product =entityManager.find(Product.class,id);
		entityTransaction.begin();
		entityManager.remove(product);
		entityTransaction.commit();
		return true;
	}
	
	//get by id
	public Product getProductById(int id) {
		return entityManager.find(Product.class,id);
	}
	
//to save product
	public Product saveProduct(Product product) {
		entityTransaction.begin();
		entityManager.persist(product);
		entityTransaction.commit();
		return product;
	}

}
