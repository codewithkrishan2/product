package com.kksg.service.impl;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kksg.dto.ProductDto;
import com.kksg.entity.Product;
import com.kksg.repository.ProductRepo;
import com.kksg.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	
	@Autowired
	private ProductRepo productRepo; //HAS-A
	
	@Autowired
	private ModelMapper mm;
	
	
	@Override
	public ProductDto getOneProduct(int id) {
		Product product = productRepo.findById(id).get();
		return mm.map(product, ProductDto.class);
		 
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductDto saveProduct(ProductDto product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductDto updateProduct(ProductDto product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		
	}

}
