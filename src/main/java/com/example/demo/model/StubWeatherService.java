package com.example.demo.model;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service
public class StubWeatherService {
 
    public CurrentWeather getCurrentWeather(String city, String country) {
        return new CurrentWeather("Clear", BigDecimal.ONE, BigDecimal.ZERO, BigDecimal.TEN);
    }
}
