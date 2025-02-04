package com.example.scheduling_tasks.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service // or component
public class ScheduledTasks {
    // log at terminal, different from print
    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    // other options for periodic times are "cron" and "fixedRate"
    // for one-time task its sufficient to add "initialDelay"
    // cron is for specific times of month, week and ... [READ MORE]
    // it is milliseconds
    @Scheduled(fixedDelay = 3000, initialDelay = 3000)
    public void reportCurrentTime() {
        log.info("Method triggered at {}", dateFormat.format(new Date()));
    }
}
