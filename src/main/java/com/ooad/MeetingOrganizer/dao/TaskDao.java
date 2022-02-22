package com.ooad.MeetingOrganizer.dao;

import com.ooad.MeetingOrganizer.model.Task;

import java.sql.Connection;
import java.util.List;

/**
 * A Data Access Object for handling CRUD operations on Task table in database.
 */
public class TaskDao extends UserCalendarDao {
    private Connection connection = getConnection();

    public void insert(Task task) {
    }

    public void update(Task task, long id) {
    }

    public List<Task> load(String username) {
        return null;
    }

    public void delete(long id) {
    }
}
