package com.example.demo.domain;

public class ResponseResult<T> {

	private int result = 1;
	private String message;
	private T data;
	
	public ResponseResult(int result, String message) {
		this.result = result;
		this.message = message;
	}

	public ResponseResult(String message) {
		this.message = message;
	}

	public ResponseResult() {
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
