package com.ecommerce.sportyshoes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.sportyshoes.model.Admin;
import com.ecommerce.sportyshoes.repositories.AdminRep;

@Service
public class LoginPageService {
	
	@Autowired
	private AdminRep rep ;

	
	public boolean validateAdmin(Admin admin) {
		List<Admin> adminList = rep.findByNameAndPassword(admin.getName(),admin.getPassword());
		if(adminList!=null && (!adminList.isEmpty())) {
			return true;
		}
		return false;
	}
	
}
