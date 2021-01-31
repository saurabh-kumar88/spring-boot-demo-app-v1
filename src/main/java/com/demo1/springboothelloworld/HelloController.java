package com.demo1.springboothelloworld;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Greetings from spring boot!";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "<h2>Welcome to about pager!</h2>";
	}
	
	@RequestMapping("/user")
	public String user() {
		return "<h2>Welcome to users page!</h2>";
	}
	
}
