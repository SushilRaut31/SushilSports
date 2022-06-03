package com.sports.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Contoller {
		
	@GetMapping("/welcome")
 public String welcome() {
	 return "welcome";
 }
	
	
	@GetMapping("/changepass")
	 public String change() {
		 return "change";
	 }
}
