package com.bootPractice.demoBoot.beans;

import com.bootPractice.demoBoot.interfaces.Coach;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println("CricketCoach Constr");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice Bowl 10min ";
    }

}
