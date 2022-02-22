package com.ooad.MeetingOrganizer.model;

import java.io.Serializable;
import java.util.Date;

/**
 * A model class representing meeting entity.
 */
public class Meeting extends Event implements Serializable {
    private static final long serialVersionUID = -419081986758828436L;

    private Date startTime;
    private Date endTime;

    public Meeting() {
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void createEvent() {
    }

    public void updateEvent() {
    }

    public void deleteEvent() {
    }

    public boolean checkAvailability() {
        return true;
    }

    public void notifyMembers() {
    }

    public void meetingReminder() {
    }
}
