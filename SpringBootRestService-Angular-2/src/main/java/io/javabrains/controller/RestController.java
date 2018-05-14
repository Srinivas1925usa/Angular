package io.javabrains.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@RequestMapping("/hi")
	public String sayHi() {
		
		return "hi";
	}

}
