package com.mypackage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mypackage.entity.Books;
import com.mypackage.services.AllServices;

@RestController
public class MyController {

	@Autowired
	AllServices allServices;
	
	@GetMapping("/")
	@ResponseBody
	public String get() {
		return "hello";
	}
	
	
	@GetMapping("/view")
	public Iterable<Books> view() {
		return allServices.view();
	}
}
