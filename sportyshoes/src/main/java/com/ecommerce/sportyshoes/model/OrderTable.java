package com.ecommerce.sportyshoes.model;



import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class OrderTable {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long orderId;

	private int quantity;

	private Long totalPrice;

	private String shippingAddress;

	//private Date purchaseDate;

	private String brand;
	

	private Date purchaseDate  ;
	
	

	@ManyToOne 
	private Cust cust;

	public OrderTable(Long orderId, int quantity, Long totalPrice, String shippingAddress, String brand,
			Date purchaseDate) {
		super();
		this.orderId = orderId;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.shippingAddress = shippingAddress;
		this.brand = brand;
		this.purchaseDate = purchaseDate;
	}

	public Cust getCust() {
		return cust; 
	}

	public void setCust(Cust cust) {
		this.cust = cust;
	}


	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}


	@ManyToOne 
	private Product product ;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) { 
		this.product = product;
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}









	public OrderTable() {
		super();
	}



	public Long getOrderId() {
		return orderId;
	}



	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public Long getTotalPrice() {
		return totalPrice;
	}



	public void setTotalPrice(Long totalPrice) {
		this.totalPrice = totalPrice;
	}



	public String getShippingAddress() {
		return shippingAddress;
	}



	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}





	public OrderTable(Long orderId, int quantity, Long totalPrice, String shippingAddress, Date purchaseDate) {
		super();
		this.orderId = orderId;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.shippingAddress = shippingAddress;
		this.purchaseDate = purchaseDate;

	}






}
