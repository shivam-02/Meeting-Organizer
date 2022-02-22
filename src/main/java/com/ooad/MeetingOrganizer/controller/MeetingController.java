package com.ooad.MeetingOrganizer.controller;

import com.ooad.MeetingOrganizer.model.Meeting;
import com.ooad.MeetingOrganizer.model.Task;
import com.ooad.MeetingOrganizer.service.MeetingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * A meeting controller for incoming requests for meeting resource.
 */
@RestController
@RequestMapping("/MeetingApi")
public class MeetingController extends UserCalendarController {
    private final MeetingService meetingService = new MeetingService();

    @PostMapping("/meetings")
    Meeting createMeeting(@RequestBody Meeting meeting) {
        return meetingService.createMeeting(meeting);
    }

    @PutMapping("/meetings/{id}")
    Meeting updateMeeting(@RequestBody Meeting meeting, @PathVariable long id) {
        return meetingService.updateMeeting(meeting, id);
    }

    @GetMapping("/meetings/{username}")
    List<Meeting> getAllMeetings(@PathVariable String username) {
        return meetingService.getAllMeetings(username);
    }

    @DeleteMapping("/meetings/{id}")
    void deleteMeeting(@PathVariable long id) {
        meetingService.deleteMeeting(id);
    }
}
