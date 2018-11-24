package com.example.demo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloSpringBootApplication.class)  //需要指定启动类class
public class HelloSpringBootApplicationTests {
	
	@Autowired
	UserService userService;

	@Test
	public void testUserList() {
		List<User> list = userService.findAll();
		System.err.println(list);
	}

}
