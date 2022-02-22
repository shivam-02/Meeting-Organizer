package com.ooad.MeetingOrganizer.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 * A model class representing event entity.
 */
public class Event implements Serializable {
    private static final long serialVersionUID = -5488493607003818771L;

    private int eventId;
    private String title;
    private String description;
    private Date date;
    private ArrayList<String> userList;

    public Event() {
        // Logic to generate auto-incremented event id
        userList = new ArrayList<>();
    }

    public int getEventId() {
        return eventId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList<String> getUserList() {
        return userList;
    }

    public void addToUserList(String user) {
        this.userList.add(user);
    }

    public void createEvent() {
    }

    public void updateEvent() {
    }

    public void deleteEvent() {
    }
}
