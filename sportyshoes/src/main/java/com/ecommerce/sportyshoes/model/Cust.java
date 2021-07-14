package com.ecommerce.sportyshoes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cust {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long custId;
	
	private String name;
	
	private Integer age;
	
	private String email;
	
	
	public Cust() {
		super();
	}

	public Cust(Long custId, String name, Integer age, String email) {
		super();
		this.custId = custId;
		this.name = name;
		this.age = age;
		this.email = email;
	}

	public Long getCustId() {
		return custId;
	}
	
	public void setCustId(Long custId) {
		this.custId = custId;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [custId=" + custId + ", name=" + name + ", age=" + age + ", email=" + email + "]";
	}
	
	


}
