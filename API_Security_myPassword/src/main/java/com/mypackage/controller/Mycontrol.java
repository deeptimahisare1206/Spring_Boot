package com.mypackage.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class Mycontrol {

	
	@GetMapping("/normal")
	public ResponseEntity<String> normalU(){
		return ResponseEntity.ok("I am Normal User");
	}
	@GetMapping("/public")
	public ResponseEntity<String> publicU(){
		return ResponseEntity.ok("I am Public User");
	}
	@GetMapping("/admin")
	public ResponseEntity<String> adminU(){
		return ResponseEntity.ok("I am Administrator");
	}
}
