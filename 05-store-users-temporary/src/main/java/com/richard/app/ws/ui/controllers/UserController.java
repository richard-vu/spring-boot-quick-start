/**
 * -----Coder's House Teams-----
 * Skype: luongvu.work@gmail.com
 * Mail: codershouseteams@gmail.com
 * Phone Number: (+84) 0935710974 - (+84) 0935810974
 * Project Name: 05-store-users-temporary
 * Create Date: Nov 3, 2019
 */
package com.richard.app.ws.ui.controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.richard.app.ws.ui.model.request.UserDetailsRequestModel;
import com.richard.app.ws.ui.model.response.UserRest;

/**
 * @author richard
 *
 */

@RestController
@RequestMapping("/users") // http://localhost:8080/richard-vu-spring-boot-quick-start-app-ws
public class UserController {

	Map<String, UserRest> users;
	
	@GetMapping
	public String getAllUsers(@RequestParam(value = "page", defaultValue = "1") int page,
			@RequestParam(value = "limit", required = true) int limit,
			@RequestParam(value = "sort", defaultValue = "desc") String sort) {
		return "Get user was called with page: " + page + " - limit: " + limit + " - sort: " + sort;
	}

	@GetMapping(path = "/{userId}", produces = { MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<UserRest> getUserById(@PathVariable String userId) {
		if(users.containsKey(userId)) {
			return new ResponseEntity<>(users.get(userId), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}

	@PostMapping(consumes = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE }, produces = {
			MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<UserRest> createUser(@Valid @RequestBody UserDetailsRequestModel userDetails) {
		UserRest returnUser = new UserRest();

		returnUser.setFirstName(userDetails.getFirstName());
		returnUser.setLastName(userDetails.getLastName());
		returnUser.setEmail(userDetails.getEmail());
		
		String userId = UUID.randomUUID().toString();
		returnUser.setUserId(userId);
		
		if(users == null) {
			users = new HashMap<>();
		}
		
		users.put(userId, returnUser);
		
		return new ResponseEntity<UserRest>(returnUser, HttpStatus.OK);
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
