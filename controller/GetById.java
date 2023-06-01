package com.jsp.controller;

import com.jsp.dto.Product;
import com.jsp.service.ProductService;

public class GetById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ProductService productService =new ProductService();
Product product=productService.getProductById(1);
if(product!=null) {
	System.out.println(product.getBrand());
	System.out.println(product.getName());	
}else {
	System.out.println("incorrect id");
}
	}

}
