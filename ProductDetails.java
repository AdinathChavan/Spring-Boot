package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDetails extends JpaRepository<Product, Integer>{
	
}
