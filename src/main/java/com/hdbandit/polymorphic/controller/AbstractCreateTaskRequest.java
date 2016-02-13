package com.hdbandit.polymorphic.controller;

import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonSubTypes.Type;
import org.codehaus.jackson.annotate.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "taskType")  
@JsonSubTypes({ @Type(value = UserCreateTaskRequest.class, name = "user"), @Type(value = GroupCreateTaskRequest.class, name = "group") }) 
public abstract class AbstractCreateTaskRequest implements CreateTaskRequest {
	
	private String title;
	private String description;
	private TaskType taskType;

	public AbstractCreateTaskRequest(TaskType taskType) {
		this.taskType = taskType;
	}

	@Override
	public String getTitle() {
		return this.title;
	}

	@Override
	public String getDescription() {
		return this.description;
	}

	@Override
	public TaskType getType() {
		return this.taskType;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
