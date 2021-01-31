package com.demo1.springboothelloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductsController {
	
	@RequestMapping("/products")
	public String productsCount() {
		return "<h1>Welocome to products page!</h1>";
	}
	

}
