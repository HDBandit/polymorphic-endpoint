package com.hdbandit.polymorphic.controller;

public class UserCreateTaskRequest extends AbstractCreateTaskRequest {
	
	private String userName;

	public UserCreateTaskRequest() {
		super(TaskType.USER);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
