package com.ecommerce.sportyshoes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.sportyshoes.model.Product;

public interface ProductRep extends JpaRepository<Product, Long>{

	
	
}
