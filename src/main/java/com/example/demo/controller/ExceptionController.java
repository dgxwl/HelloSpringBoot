package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 处理全局异常
 * @author dgxwl
 *
 */
@ControllerAdvice
public class ExceptionController {

	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public Map<String, Object> error(Throwable e) {
		Map<String, Object> map = new HashMap<>();
		map.put("status", 500);
		map.put("message", e.getMessage());
		
		return map;
	}
}
