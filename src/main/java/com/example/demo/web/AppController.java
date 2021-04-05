package com.example.demo.web;

import java.math.BigDecimal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.CurrentWeather;
import com.example.demo.model.LiveWeatherService;
import com.example.demo.model.StubWeatherService;

@Controller
public class AppController {

    private final StubWeatherService stubWeatherService;
    private final LiveWeatherService liveWeatherService;
 
    public AppController(StubWeatherService stubWeatherService, LiveWeatherService liveWeatherService) {
        this.stubWeatherService = stubWeatherService;
        this.liveWeatherService = liveWeatherService;
    }
 
    @GetMapping("/weather")
    public String getCurrentWeather(Model model) {
        if (true) {
            model.addAttribute("currentWeather", liveWeatherService.getCurrentWeather("Detroit","us"));
        } else {
            model.addAttribute("currentWeather", stubWeatherService.getCurrentWeather("Detroit","us"));
        }
        return "weather";
    }
	
}
