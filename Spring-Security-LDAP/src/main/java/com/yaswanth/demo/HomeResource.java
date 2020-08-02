package com.yaswanth.demo;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
     
	@GetMapping("/")
	public String home(Principal principal) {
		
		return ("<h1>Welcome</h1>"+principal.getName());
	}
	
	
//	@GetMapping("/user")
//	public String user() {
//		return ("<h1>Welcome yaswanth</h1>");
//	}
//	@GetMapping("/admin")
//	public String admin() {
//		return ("<h1>Welcome Admin</h1>");
//	}
	
	
}
