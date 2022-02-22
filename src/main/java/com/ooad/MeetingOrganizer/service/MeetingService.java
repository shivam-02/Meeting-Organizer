package com.ooad.MeetingOrganizer.service;

import com.ooad.MeetingOrganizer.dao.MeetingDao;
import com.ooad.MeetingOrganizer.model.Meeting;

import java.util.List;

/**
 * A service class for handling application logic on meetings.
 */
public class MeetingService extends UserCalendarService {
    private final MeetingDao meetingDao = new MeetingDao();

    public Meeting createMeeting(Meeting meeting) {
        meetingDao.insert(meeting);
        return null;
    }

    public Meeting updateMeeting(Meeting meeting, long id) {
        // some more application logic
        meetingDao.update(meeting, id);
        return null;
    }


    public List<Meeting> getAllMeetings(String username) {
        // sorting logic based on date timestamp
        return meetingDao.load(username);
    }

    public void deleteMeeting(long id) {
        meetingDao.delete(id);
    }
}
