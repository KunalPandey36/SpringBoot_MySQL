package com.kunaltut.kunalspring.controller;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class MyController {
	
	@GetMapping("/")
	public String helloWorld() {
		return "Welcome to tutolrialaaamiii";
	}
}
