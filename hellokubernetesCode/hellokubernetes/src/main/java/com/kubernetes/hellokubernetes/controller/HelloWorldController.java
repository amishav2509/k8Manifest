package com.kubernetes.hellokubernetes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/hellokubernetes")
	public String index() {
		return "Hello welcome to world of kubernetes";
		// TODO Auto-generated constructor stub
	}

}
