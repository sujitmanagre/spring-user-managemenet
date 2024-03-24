package com.learning.user.mgmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.user.mgmt.model.User;
import com.learning.user.mgmt.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/register")
	public User register(@RequestBody User user) {
		return userService.saveUser(user);
	}
}
