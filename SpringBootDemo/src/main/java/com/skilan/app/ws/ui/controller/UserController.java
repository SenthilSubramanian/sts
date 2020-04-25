package com.skilan.app.ws.ui.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {

	@GetMapping
	public String getUser() {
		return "getUser is called";
	}
	
	@PostMapping
	public String createUser() {
		return "createUser is called";
	}
	
	@PutMapping
	public String updateUser() {
		return "updateUser is called";
	}
	
	@DeleteMapping
	public String deleteUser() {
		return "deleteUser is called";
	}
	
}
