package com.hdbandit.polymorphic.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController {

	@RequestMapping(method = RequestMethod.POST)
	public void createTask(@RequestBody CreateTaskRequest createTaskRequest) {
		if (TaskType.GROUP.equals(createTaskRequest.getType())) {
			System.out.println("Creating group task");
		}
		
		if (TaskType.USER.equals(createTaskRequest.getType())) {
			System.out.print("Creating user task");
		}
	}

}
