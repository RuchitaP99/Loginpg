package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class HomeController {

	@GetMapping("/home")
	public String home(){
		return "this is home pg";
	}
	
	@GetMapping("/login")
	public String login(){
		return "this is login pg";
	}
	
}
