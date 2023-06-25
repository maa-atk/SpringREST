package com.bootPractice.demoBoot.beans;

import com.bootPractice.demoBoot.interfaces.Coach;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Lazy
@Component

public class FootBallCoach implements Coach {
    public FootBallCoach() {
        System.out.println("FootBallCoach Constr");
    }
    @Override
    public String getDailyWorkout() {
        return "Practice dribbling (from football bean)";
    }


}
