package com.ooad.MeetingOrganizer.model;

import java.io.Serializable;

/**
 * A model class representing task entity.
 */
public class Task extends Event implements Serializable {
    private static final long serialVersionUID = -2322191362357467932L;

    private String status;

    public Task() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void createEvent() {
    }

    public void updateEvent() {
    }

    public void deleteEvent() {
    }

}
