package com.ecommerce.sportyshoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecommerce.sportyshoes.model.Admin;
import com.ecommerce.sportyshoes.services.LoginPageService;

@Controller
@RequestMapping("/sportyshoes")
public class LoginPageController {
	
	@Autowired
	private LoginPageService loginPageService;

	
	@GetMapping("/")
	public String viewLoginPage(Model model) {
		Admin admin = new Admin();
		model.addAttribute("admin", admin);
		model.addAttribute("flag1", "login");
		return "login";
	}
	
	@PostMapping("/validateAdmin")
	public String validateAdmin(@ModelAttribute("admin") Admin admin,Model model) {
		boolean flag = loginPageService.validateAdmin(admin);
		if(flag) {
			model.addAttribute("admin", admin);
			model.addAttribute("flag2", "home");
			return "homepage";
		}
		else {
			Admin newAdmin = new Admin();
			model.addAttribute("admin", newAdmin);
			model.addAttribute("flag1", "wrongCredentials");
			return "login";
		}

		
	}

	
	
}
