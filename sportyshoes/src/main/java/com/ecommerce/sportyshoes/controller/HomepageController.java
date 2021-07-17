package com.ecommerce.sportyshoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecommerce.sportyshoes.model.Admin;
import com.ecommerce.sportyshoes.model.Cust;
import com.ecommerce.sportyshoes.model.OrderTable;
import com.ecommerce.sportyshoes.model.Product;
import com.ecommerce.sportyshoes.services.HomePageService;

@Controller
@RequestMapping("/home")
public class HomepageController {
	
	@Autowired
	HomePageService homePageService;

	@PostMapping("/changePassword")
	public String changePassword(Model model) {
		Admin admin = new Admin();
		model.addAttribute("admin", admin);
		return "changePassword";
	}
	
	

	@PostMapping("/updatepassword")
	public String updatePassword(@ModelAttribute("admin") Admin admin,Model model) {
		boolean flag = homePageService.updatePassword(admin);
		if(flag) {
			model.addAttribute("admin", admin);
			model.addAttribute("flag2", "updatePassword");
			return "homepage";
		}
		else {
			model.addAttribute("admin", admin);
			return "homepage";
		}
		
	}
	
	
	@PostMapping("/custlist")
	public String getCustList(@ModelAttribute("admin") Admin admin,Model model) {
		Cust cust = new Cust();
		List<Cust> custList = homePageService.getCustList();
		model.addAttribute("custList", custList);
		model.addAttribute("cust", cust);
		return "custList";


	}
	
	@PostMapping("/searchcust")
	public String searchCust(@ModelAttribute("cust") Cust cust,Model model) {
		List<Cust> custList = homePageService.searchCust(cust.getName());
		model.addAttribute("custList", custList);
		model.addAttribute("cust", cust);
		return "custList";

	}
	
	@PostMapping("/purchasereportlist")
	public String getPurchaseReport(@ModelAttribute("orderTable") OrderTable orderTable,Model model) {
		List<OrderTable> purchaseList = homePageService.searchPurchaseReport();
		model.addAttribute("purchaseList", purchaseList);
		model.addAttribute("orderTable", orderTable);
		return "purchaseList";

	}
	
	
	@PostMapping("/filterbybrand")
	public String filterbybrand(@ModelAttribute("orderTable") OrderTable orderTable,Model model) {
		List<OrderTable> brandFilteredList = homePageService.filterbybrand(orderTable.getBrand());
		model.addAttribute("purchaseList", brandFilteredList);
		model.addAttribute("orderTable", orderTable);
		return "purchaseList";

	}
	
	
	@PostMapping("/filterbydate")
	public String filterbydate(@ModelAttribute("orderTable") OrderTable orderTable,Model model) {
		List<OrderTable> purchaseList = homePageService.filterbyDate(orderTable.getPurchaseDate());
		model.addAttribute("purchaseList", purchaseList);
		model.addAttribute("orderTable", orderTable);
		return "purchaseList";

	}
	
	

	@PostMapping("/manageproducts")
	public String manageProducts(Model model) {
		Product product = new Product();
		List<Product> productList = homePageService.findAll();
		model.addAttribute("productList", productList);
		model.addAttribute("product", product);
		return "manageproducts";

	}
	
	@PostMapping("/addproduct")
	public String addProduct(Model model) {
		Product product = new Product();
		model.addAttribute("product", product);
		return "addproduct";

	}
	
	
	@PostMapping("/addnewproduct")
	public String addNewProduct(@ModelAttribute("orderTable") Product product,Model model) {
		
		homePageService.addNewProduct(product);
		Product newProduct = new Product();
		model.addAttribute("product", newProduct);
		model.addAttribute("flag3", "productAdded");
		return "addproduct";

	}
	
	

	
}
