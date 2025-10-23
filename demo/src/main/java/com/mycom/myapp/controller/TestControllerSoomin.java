package com.mycom.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestControllerSoomin {
	
	@GetMapping("/hello")
	public String hello() {
		return "/hello.html";
	}
}