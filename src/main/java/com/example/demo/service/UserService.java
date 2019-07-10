package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.ResponseResult;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;

@Service
public class UserService implements IUserService {
	
	@Autowired
	UserMapper userMapper;

	@Override
	public ResponseResult<User> register(User user) {
		User u = userMapper.findByUsername(user.getUsername());
		if (u != null) {
			return new ResponseResult<>(-1, "该用户名已被注册");
		} else {
			userMapper.insertSelective(user);
			return new ResponseResult<>("注册成功!");
		}
	}
	
	@Override
	public List<User> findAll() {
		return userMapper.findAll();
	}
}
