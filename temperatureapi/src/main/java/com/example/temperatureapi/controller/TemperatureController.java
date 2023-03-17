package com.example.temperatureapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/temp")
public class TemperatureController {
    
    @GetMapping
    public Double convert(Double temp, String type) {

        if (type.equals("F")) {
            return (temp * 1.8) + 32;
        } else if (type.equals("C")) {
            return (temp + 32)/0.5556;
        }
        return 0.0;
    }
}
