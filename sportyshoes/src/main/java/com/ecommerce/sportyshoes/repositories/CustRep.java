package com.ecommerce.sportyshoes.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.sportyshoes.model.Cust;

public interface CustRep extends JpaRepository<Cust, Long>{
	
	public List<Cust> findByName(String name);
	
	

}
