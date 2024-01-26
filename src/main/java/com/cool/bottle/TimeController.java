package com.cool.bottle;

import java.time.ZonedDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {

    @GetMapping("/time")
	 public String getTimeAndRegion() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        String time = zonedDateTime.toString();
        String region = zonedDateTime.getZone().getId();
        return "Time: " + time + ",\nRegion: " + region;
    }
    
}
