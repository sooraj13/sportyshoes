package com.ecommerce.sportyshoes.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.sportyshoes.model.Admin;

@Repository
public interface AdminRep extends JpaRepository<Admin,Long>{

	public List<Admin> findByNameAndPassword(String name, String password); 
	
	public List<Admin> findByName(String name);
	
}
