package com.jsp.controller;

import com.jsp.service.ProductService;

public class DeleteController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ProductService productService =new ProductService();
boolean flag=productService.deleteProductById(2);
if(flag==true) {
	System.out.println("product deleted");
}else {
	System.out.println("product not deleted");
}
	}

}
