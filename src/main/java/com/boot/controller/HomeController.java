package com.boot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@Value("${server.servlet.context-path}")
	private String servletName;
	
	@Value("${person.name}")
	private String personName;
	
	@RequestMapping("/")
	public String home() {
		//return "Return the Home Page";
		//System.out.println(servletName);
		//System.out.println(personName);
		return "Hello Brian";
	}
}
