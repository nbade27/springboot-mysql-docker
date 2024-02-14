package com.naga.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naga.user.model.User;
import com.naga.user.repo.UserRepo;

@RestController
public class UserController {

	@Autowired
	UserRepo userRepo;

	/**
	 * 
	 * @return List of uses
	 */
	@GetMapping("/users")
	public Iterable<User> getUsers() {
		return userRepo.findAll();
	}
}
