package com.revature.BackendJava.controller;


import com.revature.BackendJava.model.Task;
import com.revature.BackendJava.service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/tasks")
public class TaskController {

    TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping(path = "/")
    public Task addTask(Task task){
        return this.taskService.createTask(task);
    }

    @GetMapping(path = "/")
    public List<Task> getTask(){
        return this.taskService.retrieveTask();
    }
}
