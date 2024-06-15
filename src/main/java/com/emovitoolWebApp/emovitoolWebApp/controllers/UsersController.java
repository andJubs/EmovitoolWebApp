package com.emovitoolWebApp.emovitoolWebApp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.emovitoolWebApp.emovitoolWebApp.services.AdminRepo;
import com.emovitoolWebApp.emovitoolWebApp.models.User;

@Controller
public class UsersController {

	@Autowired
	private AdminRepo repo;

	@GetMapping("/admin")

	public String index(Model model) {

		List<User> users = (List<User>) repo.findAll();
		model.addAttribute("users", users);
		return "admin/index";
	}

	@GetMapping("admin/newUser")
	public String newUser() {
		return "admin/newUser";
	}

	@PostMapping("/admin/createNewUser")
	public String createNewUser(User user) {
		repo.save(user);
		return "redirect:/admin";
	}

	@GetMapping("/admin/{id}")
	public String editUser(@PathVariable int id, Model model) {
		Optional<User> admin = repo.findById(id);
		try {
			model.addAttribute("user", admin.get());
		} catch (Exception err) {
			return "redirect:/admin";
		}

		return "/admin/editUser";
	}	

	@PostMapping("/admin/{id}/updateUser")
	public String updateUser(@PathVariable int id, User user) {
		if (!repo.existsById(id)) {
			return "redirect:/admin";
		}

		repo.save(user);

		return "redirect:/admin";
	}

	
	@GetMapping("/admin/{id}/deleteUser")
	public String deleteUser(@PathVariable int id) {
		repo.deleteById(id);
		return "redirect:/admin";
	}
}
