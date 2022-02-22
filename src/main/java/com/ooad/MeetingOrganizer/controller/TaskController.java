package com.ooad.MeetingOrganizer.controller;

import com.ooad.MeetingOrganizer.model.Task;
import com.ooad.MeetingOrganizer.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * A Task controller for handling incoming requests for task resource.
 */
@RestController
@RequestMapping("/TaskApi")
public class TaskController extends UserCalendarController {
    private final TaskService taskService = new TaskService();

    @PostMapping("/tasks")
    Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    @PutMapping("/tasks/{id}")
    Task updateTask(@RequestBody Task task, @PathVariable long id) {
        return taskService.updateTask(task, id);
    }

    @GetMapping("/tasks/{username}")
    List<Task> getAllTasks(@PathVariable String username) {
        return taskService.getAllTasks(username);
    }

    @DeleteMapping("/tasks/{id}")
    void deleteTask(@PathVariable long id) {
        taskService.deleteTask(id);
    }
}
