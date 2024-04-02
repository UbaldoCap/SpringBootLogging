package com.example.SpringBootLogging.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class HomeService {
    Logger logger = LoggerFactory.getLogger(HomeService.class);

    public Double exp(Double a, Double b) {
        logger.debug("inizio calcolo");
        Double c = Math.pow(a, b);
        logger.debug("fine calcolo");
        return c;
    }
}
