package com.wego.web.controllers;
import java.util.Locale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.wego.web.serviceimpl.AdminServiceImpl;
import com.wego.web.services.AdminService;

@Controller
public class HomeController {
	
	private static final Logger Logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired AdminServiceImpl adminService;
	
	@GetMapping("/")
	public String home(Locale locale, Model model) {
		Logger.info("Welcome  {}.", "HomeController");
		int count = adminService.findTheNumberOfAdmins();
		model.addAttribute("count", count );
		return "home";
	}
	
}
