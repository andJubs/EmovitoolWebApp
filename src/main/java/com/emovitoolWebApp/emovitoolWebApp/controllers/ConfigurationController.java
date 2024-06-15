package com.emovitoolWebApp.emovitoolWebApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConfigurationController {
	
	@GetMapping("/configuration")
	public String indexConfigurarion() {
		
		return "/config/defaultConfiguration";
	}
}
