package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.UserDao;
import com.example.model.User;
import com.example.service.UserService;

@RestController
//@RequestMapping(path = "/user")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping(path="/users")
	public List<User> retriveall(){
		return service.findAll();
	}
	@GetMapping( path="/users/{id}")
	public Optional<User> retrive(@PathVariable int id){
		return service.findById(id);
	}
	@PostMapping("/userinsert")
	public void createuser(@RequestBody User user){
		service.save(user);
	}
	
	

}
