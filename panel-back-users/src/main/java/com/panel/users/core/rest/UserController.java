package com.panel.users.core.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.panel.users.core.domain.User;
import com.panel.users.core.repository.UserRepository;

@RestController
public class UserController {
	
	private UserRepository userRepository;
	
	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/listUsers")
	public List<User> listUsers() {
		
		List<User> listUsers = userRepository.findAll();
		System.out.println(listUsers.size());
		
		return listUsers;
		
	}
}
