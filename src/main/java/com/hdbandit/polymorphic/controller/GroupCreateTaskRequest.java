package com.hdbandit.polymorphic.controller;

public class GroupCreateTaskRequest extends AbstractCreateTaskRequest {
	
	private String groupName;

	public GroupCreateTaskRequest() {
		super(TaskType.GROUP);
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

}
