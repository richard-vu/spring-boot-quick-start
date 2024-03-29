/**
 * -----Coder's House Teams-----
 * Skype: luongvu.work@gmail.com
 * Mail: codershouseteams@gmail.com
 * Phone Number: (+84) 0935710974 - (+84) 0935810974
 * Project Name: 02-spring-boot-quick-start-handle-http-get-request
 * Create Date: Nov 2, 2019
 */
package com.richard.app.ws.ui.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author richard
 *
 */


@RestController
@RequestMapping("/users") // http://localhost:8080/richard-vu-spring-boot-quick-start-app-ws
public class UserController {
	
	@GetMapping
	public String getAllUsers(@RequestParam(value="page", defaultValue = "1") int page,
			@RequestParam(value="limit", required = true) int limit,
			@RequestParam(value="sort", defaultValue = "desc") String sort) {
		return "Get user was called with page: " +page +" - limit: " +limit +" - sort: " +sort;
	}
	
	@GetMapping(path="/{userId}")
	public String getUserById(@PathVariable int userId) {
		return "Get user was called with ID: " +userId;
	}
	
	@PostMapping
	public String createUser() {
		return "Create user was called!";
	}
	
	@PutMapping
	public String updateUser() {
		return "Update user was called!";
	}
	
	@DeleteMapping
	public String deleteUser() {
		return "Delete user was called!";
	}
}
