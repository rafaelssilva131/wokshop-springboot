package com.cursoudemy.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cursoudemy.course.entites.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "null", "null", "null", "null");
		return ResponseEntity.ok().body(u);
	}
	
}
