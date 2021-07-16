package com.ecommerce.sportyshoes.repositories;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.sportyshoes.model.OrderTable;

public interface OrderTableRep extends JpaRepository<OrderTable, Long> {
	
	
	public List<OrderTable> findByBrand(String brand);
	
	public List<OrderTable> findByPurchaseDate(Date purchaseDate);

}
