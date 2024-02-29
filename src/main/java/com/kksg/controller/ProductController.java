package com.kksg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kksg.entity.Product;
import com.kksg.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/{id}")
	public ResponseEntity<Product> gettingOneProductById(@PathVariable int id) {
		
		
		Product product = productService.getOneProduct(id);
		
		return new ResponseEntity<Product>(product, HttpStatus.OK);
		
		
		
	}
	

	@PostMapping("/save")
	public void savingOneProduct() {
			
	}
	
}
