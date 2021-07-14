package com.ecommerce.sportyshoes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sportyshoes")
public class LoginPageController {

	
	@GetMapping("/")
	public String viewLoginPage(Model model) {
		return "login";
	}
	
	/*
	 * public String validateAdmin(Model model) {
	 * 
	 * }
	 */
	
	
}
