package com.ecommerce.sportyshoes.services;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.sportyshoes.model.Admin;
import com.ecommerce.sportyshoes.model.Cust;
import com.ecommerce.sportyshoes.model.OrderTable;
import com.ecommerce.sportyshoes.model.Product;
import com.ecommerce.sportyshoes.repositories.AdminRep;
import com.ecommerce.sportyshoes.repositories.CustRep;
import com.ecommerce.sportyshoes.repositories.OrderTableRep;
import com.ecommerce.sportyshoes.repositories.ProductRep;

@Service
public class HomePageService {
	
	@Autowired
	AdminRep adminRep ;
	
	@Autowired
	CustRep custrep;
	
	@Autowired
	OrderTableRep ordertableRep;
	
	@Autowired
	ProductRep productRep;

	public boolean updatePassword(Admin admin) {
		
		List<Admin> adminList = adminRep.findByName(admin.getName());
		Admin sAdmin = adminList.get(0);
		sAdmin.setPassword(admin.getPassword());
		adminRep.save(sAdmin);
		return true;
		
	}

	public List<Cust> getCustList() {
		return custrep.findAll();
	}
	
	public List<Cust> searchCust(String name) {
		return custrep.findByName(name);
	}

	public List<OrderTable> searchPurchaseReport() {
		return ordertableRep.findAll();
	}

	public List<OrderTable> filterbybrand(String brand) {
		return ordertableRep.findByBrand(brand);
	}

	public List<OrderTable> filterbyDate(Date purchaseDate) {
		return ordertableRep.findByPurchaseDate(purchaseDate);
	}

	public List<Product> findAll() {
		return productRep.findAll();
	}

	public void addNewProduct(Product product) {
		productRep.save(product);
		
	}
	
	
	
	
	
	
	

}
