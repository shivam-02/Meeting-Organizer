package com.ooad.MeetingOrganizer.model;

import java.io.Serializable;

/**
 * A model class representing user entity.
 */
public class UserCalendar implements Serializable {
    private static final long serialVersionUID = -6438532549109815655L;

    private String username;
    private String password;
    private String email;

    public UserCalendar() {
        // this would be a singleton design pattern with only one instance
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void displayTasks() {
    }

    public void displayMeetings() {
    }
}
