package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
		return "Hello spring boot!";
	}
	
	//演示全局异常
	@RequestMapping("/ex")
	public String testHandleException() {
		int i = 1 / 0;
		return i+"";
	}
}
