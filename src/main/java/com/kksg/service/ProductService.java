package com.kksg.service;

import java.util.List;

import com.kksg.entity.Product;

public interface ProductService {

	Product getOneProduct(int id);
	
	List<Product> getAllProducts();
	
	Product saveProduct(Product product);
	
	Product updateProduct(Product product);
	
	void deleteProduct(int id);
}
