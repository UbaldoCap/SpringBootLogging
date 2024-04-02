package com.example.SpringBootLogging.controllers;

import com.example.SpringBootLogging.services.HomeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HomeController {
    Logger logger = LoggerFactory.getLogger(HomeController.class);
    @Autowired
    private HomeService homeService;
    @Value("${custom.first}")
    private Double first;
    @Value("${custom.second}")
    private Double second;
    @GetMapping
    public String welcome() {
        String message = "Welcome";
        logger.info("this is the message: " + message);
        return message;
    }

    @GetMapping("exp")
    public Double exp() {
        return homeService.exp(first, second);
    }

    @GetMapping("/get-errors")
    public String getErrors() {
        logger.error("Errore");
        throw new RuntimeException("error, error, error");
    }
}
