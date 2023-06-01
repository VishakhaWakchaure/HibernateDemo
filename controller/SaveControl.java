package com.jsp.controller;

import com.jsp.dto.Product;
import com.jsp.service.ProductService;

public class SaveControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ProductService productService =new ProductService();
Product product =new Product();
product.setBrand("xyz");
product.setName("abc");

Product p2=productService.saveProduct(product);
if(p2!=null) {
	System.out.println("product save");
}
	}

}
