package com.skilan.app.ws.ui.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skilan.app.ws.service.UserService;
import com.skilan.app.ws.shared.dto.UserDTO;
import com.skilan.app.ws.ui.model.response.UserRest;

@RestController
@RequestMapping("users")
public class UserController {

	@Autowired
	UserService service;
	
	@GetMapping
	public String getUser() {
		return "getUser is called";
	}
	
	@PostMapping
	public UserRest createUser(@RequestBody com.skilan.app.ws.ui.model.request.UserDetailsRequestModel userDetails) {
		UserRest response = new UserRest();
		UserDTO dto = new UserDTO();
		BeanUtils.copyProperties(userDetails, dto);
		UserDTO resultDTO = service.createUser(dto);
		BeanUtils.copyProperties(resultDTO, response);
		return response;
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
