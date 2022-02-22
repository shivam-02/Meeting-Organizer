package com.ooad.MeetingOrganizer.service;

import com.ooad.MeetingOrganizer.dao.TaskDao;
import com.ooad.MeetingOrganizer.model.Task;
import java.util.List;

/**
 * A service class for handling application logic on tasks.
 */
public class TaskService extends UserCalendarService {
    private TaskDao taskDao = new TaskDao();

    public Task createTask(Task task) {
        taskDao.insert(task);
        return null;
    }

    public Task updateTask(Task task, long id) {
        // some more application logic
        taskDao.update(task, id);
        return null;
    }

    public List<Task> getAllTasks(String username) {
        // sorting logic based on date timestamp
        return taskDao.load(username);
    }

    public void deleteTask(long id) {
        taskDao.delete(id);
    }
}
