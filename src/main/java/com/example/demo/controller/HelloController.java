package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 使用eclipse开发时先到marketplace下载Spring Tool插件,
 * 可以直接创建出spring boot项目.
 * 
 * 接口演示
 * @author dgxwl
 *
 */
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
