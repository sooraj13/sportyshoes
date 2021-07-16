package com.ecommerce.sportyshoes.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Product {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long productId;

	private String productName;

	private String brand;

	private String size;

	private Long price;
	


	@OneToMany(mappedBy = "product") 
	private List<OrderTable> orderTable = new ArrayList<>();



	public List<OrderTable> getOrderTable() {
		return orderTable;
	}

	public void setOrderTable(List<OrderTable> orderTable) {
		this.orderTable = orderTable;
	}

	public Product() {
		super();
	}

	public Product(Long productId, String productName, String brand, String size, Long price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.brand = brand;
		this.size = size;
		this.price = price;
	}

	 public List<OrderTable> getOrder() { 
		 return orderTable; 
		 }
	  public void setOrder(List<OrderTable> orderTable) { 
		  this.orderTable = orderTable; 
		  }



	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}







}
