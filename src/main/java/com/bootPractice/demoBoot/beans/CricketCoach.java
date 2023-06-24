package com.bootPractice.demoBoot.beans;

import com.bootPractice.demoBoot.interfaces.Coach;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice Bowl 10min ";
    }

    @Override
    public String getDailyWorkoutSetterInjection() {
        return  "prac bowl via setter injection";
    }
}
