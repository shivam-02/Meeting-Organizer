package com.ooad.MeetingOrganizer.dao;

import com.ooad.MeetingOrganizer.model.Meeting;

import java.sql.Connection;
import java.util.List;

/**
 * A Data Access Object for handling CRUD operations on Meeting table in database.
 */
public class MeetingDao extends UserCalendarDao {
    private Connection connection = getConnection();

    public void insert(Meeting meeting) {
    }

    public void update(Meeting meeting, long id) {
    }

    public List<Meeting> load(String username) {
        return null;
    }

    public void delete(long id) {
    }

}
