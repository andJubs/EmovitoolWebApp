package com.emovitoolWebApp.emovitoolWebApp.controllers;

import java.io.IOException;

import com.emovitoolWebApp.emovitoolWebApp.services.AdminRepo;
import com.emovitoolWebApp.emovitoolWebApp.models.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
  @Autowired
  private AdminRepo repo;

  @GetMapping("/login")
  public String index(){
    return "/login/login";
  }
  
  @PostMapping("/entry")
  public String entry(Model model, User userParam) {
	  return "/login/login";
  }
}