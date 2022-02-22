package com.ooad.MeetingOrganizer.controller;

import com.ooad.MeetingOrganizer.service.UserCalendarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * A high level controller for all user calendar related actions like user authentication and logging.
 */
@RestController
@RequestMapping("/UserCalendarApi")
public class UserCalendarController {
    private final UserCalendarService userCalendarService = new UserCalendarService();

    @GetMapping("/message")
    String message() {
        return "God is in details";
    }

}

