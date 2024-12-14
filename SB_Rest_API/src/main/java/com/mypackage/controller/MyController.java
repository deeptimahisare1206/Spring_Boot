package com.mypackage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@GetMapping("/get/{id}")
	public User get(@PathVariable Integer id){
		return allServices.get(id);
	}
	
	@PostMapping("/post")
	public User post(@RequestBody User user) {
		
		return allServices.post(user);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Integer id) {
		allServices.delete(id);
	}
	
	@PutMapping("/put")
	public User put(@RequestBody User user) {
		
		return allServices.put(user);
	}
	
}
