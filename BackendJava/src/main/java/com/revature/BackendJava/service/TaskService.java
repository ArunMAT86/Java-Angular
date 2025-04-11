package com.revature.BackendJava.service;

import com.revature.BackendJava.model.Task;
import com.revature.BackendJava.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task createTask(Task task){
        return this.taskRepository.save(task);
    }

    public List<Task> retrieveTask(){
        return this.taskRepository.findAll();
    }
}
