package com.wego.web.controllers;
import java.util.Locale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
	
	private static final Logger Logger = LoggerFactory.getLogger(HomeController.class);
	
	
	@GetMapping("/")
	public String home(Locale locale, Model model) {
		Logger.info("Welcome  {}.", "HomeController");
		
		return "home";
	}
	
}
