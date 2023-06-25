package com.bootPractice.demoBoot.beans;

import com.bootPractice.demoBoot.interfaces.Coach;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FootBallCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice dribbling (from football bean)";
    }


}
