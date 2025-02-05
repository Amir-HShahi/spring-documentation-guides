package com.example.quotation.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduleTasks {
    private static final Logger log = LoggerFactory.getLogger(ScheduleTasks.class);
    private final FetchQuotes fetchQuotes;

    public ScheduleTasks(FetchQuotes fetchQuotes) {
        this.fetchQuotes = fetchQuotes;
    }

    @Scheduled(fixedDelay = 5000, initialDelay = 2000)
    public void reportNewQuote() {
        log.info(fetchQuotes.fetchQuote().toString());
    }
}
