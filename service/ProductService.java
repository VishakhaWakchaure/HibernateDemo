package com.jsp.service;

import com.jsp.dao.ProductDao;
import com.jsp.dto.Product;

public class ProductService {
ProductDao productDao=new ProductDao();

public Product saveProduct(Product product) {
	return productDao.saveProduct(product);
}
	 public Product getProductById(int id){
		if(id>0) {
			return productDao.getProductById(id);
		}else {
			return null;
		}
	}
	 
	 public boolean deleteProductById(int id) {
		 if(id>0) {
			 return productDao.deleteProductById(id);
		 }else {
			return false; 
		 }
			
	 }
	
}



