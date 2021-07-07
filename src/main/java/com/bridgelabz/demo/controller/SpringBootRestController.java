package com.bridgelabz.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class SpringBootRestController {

	@RequestMapping(value = {"", "/", "/home"})
	public String sayHello()
	{
		return "Hello From Bridgelabz";  
	}
}
