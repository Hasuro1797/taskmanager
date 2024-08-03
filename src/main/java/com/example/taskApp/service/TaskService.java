package com.example.taskApp.service;

import com.example.taskApp.model.Task;
import com.example.taskApp.repository.TaskRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public void saveTask(Task task){
        taskRepository.insertTask(task);
    }

    public List<Task> getAllTask(){
        return taskRepository.findAllTasks();
    }

}
