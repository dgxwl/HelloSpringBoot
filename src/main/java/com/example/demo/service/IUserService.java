package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.ResponseResult;
import com.example.demo.entity.User;

public interface IUserService {

	ResponseResult<User> register(User user);
	List<User> findAll();
}
