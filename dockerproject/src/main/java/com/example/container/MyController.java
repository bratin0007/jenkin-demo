package com.example.container;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	
	@GetMapping("/test")
	public String demo() {
		return "I am inside the container";
	}
	@GetMapping("/out")
	public String demo2() {
		return "I am out of the Container";
	}
}
