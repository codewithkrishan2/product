package com.kksg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kksg.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
