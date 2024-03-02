package com.kksg.service;

import java.util.List;

import com.kksg.dto.ProductDto;
import com.kksg.entity.Product;

public interface ProductService {

	ProductDto getOneProduct(int id);
	
	List<Product> getAllProducts();
	
	ProductDto saveProduct(ProductDto product);
	
	ProductDto updateProduct(ProductDto product);
	
	void deleteProduct(int id);
}
