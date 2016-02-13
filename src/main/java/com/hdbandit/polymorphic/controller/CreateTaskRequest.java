package com.hdbandit.polymorphic.controller;

public interface CreateTaskRequest {
	
	String getTitle();
	
	String getDescription();
	
	TaskType getType();

}
