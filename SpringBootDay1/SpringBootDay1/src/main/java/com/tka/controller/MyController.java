package com.tka.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/W3School")
public class MyController {

	@PostMapping("/java")
	String firstAPI() {
		return "java is OOP Language ... !";
	}

	@GetMapping("/html")
	String secondAPI() {
		return "html stands for hypertext markup language ... !";
	}

	@PutMapping("/css")
	String thirdAPI() {
		return "css used for styling web pages ... !";
	}

	@DeleteMapping("/mysql")
	String fourthAPI() {
		return "mysql is an Relational DB ... !";
	}

	@PostMapping("/js")
	String fifthAPI() {
		return "js used for responsive content  ... !";
	}

}
