package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.ResponseResult;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;

@Service
public class UserService {
	
	@Autowired
	UserMapper userMapper;

	public ResponseResult<User> register(User user) {
		User u = userMapper.findByUsername(user.getUsername());
		if (u != null) {
			return new ResponseResult<>(-1, "该用户名已被注册");
		} else {
			userMapper.insertSelective(user);
			return new ResponseResult<>("注册成功!");
		}
	}
}
