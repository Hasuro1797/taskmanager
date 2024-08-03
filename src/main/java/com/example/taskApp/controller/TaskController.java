package com.example.taskApp.controller;

import com.example.taskApp.model.Task;
import com.example.taskApp.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;

@Controller
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }

    @GetMapping("/tasks/new")
    public String showTaskForm(Model model){
        model.addAttribute("task", new Task());
        return "task-form";
    }

    @PostMapping("/add-task")
    public String addTask(Task task){
        taskService.saveTask(task);
        return "redirect:/tasks";
    }

    @GetMapping("/tasks")
    public String listTasks(Model model) {
        List<Task> tasks = taskService.getAllTask();
        model.addAttribute("tasks", tasks);
        return "task-list";
    }
}
