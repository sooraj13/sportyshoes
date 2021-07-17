package com.ecommerce.sportyshoes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long adminId;
	
	private String name;
	
	private String email;
	
	private Integer age;
	
	private String password;

	public Admin() {
		super();
	}
	
	public Admin(Long adminId, String name, String email, Integer age, String password) {
		super();
		this.adminId = adminId;
		this.name = name;
		this.email = email;
		this.age = age;
		this.password = password;
	}

	public Long getAdminId() {
		return adminId;
	}

	public void setAdminId(Long adminId) {
		this.adminId = adminId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", name=" + name + ", email=" + email + ", age=" + age + ", password="
				+ password + "]";
	}
	
	
	
	
	
	
	

}
