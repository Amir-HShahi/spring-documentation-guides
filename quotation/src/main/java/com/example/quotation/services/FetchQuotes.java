package com.example.quotation.services;

import com.example.quotation.models.Quote;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FetchQuotes {
    private final RestTemplate restTemplate = (new RestTemplateBuilder()).build();

    public Quote fetchQuote() {
        String url = "http://localhost:8080/api/random";
        return restTemplate.getForObject(url, Quote.class);
    }

}
