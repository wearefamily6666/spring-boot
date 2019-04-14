package com.example.spring_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@RequestMapping("/")
	public String test() {
		return "test1";
	}
	
	@Autowired
	private Resource resource;
	
	@RequestMapping("/getResource")
	public Resource getResource() {
		System.out.println(resource.getLanguage());
		System.out.println(resource.getName());
		System.out.println(resource.getWebsite());
		return resource;
	}
}
