package com.mypackage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mypackage.entity.User;
import com.mypackage.services.AllServices;

@RestController
public class MyController {

	@Autowired
	AllServices allServices;
	
//	@GetMapping("/getAll")
//	public List<User> getAll(){
//		
//		return allServices.getAll();
//	}
	
	@GetMapping("/getAll")
	public Iterable<User> getAll(){
		
		return allServices.getAll();
	}
	
}
