package com.bootPractice.demoBoot.controllers;
import com.bootPractice.demoBoot.interfaces.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach coachObject;
    private Coach coSetter;
    @Autowired
    public DemoController (Coach theCoach){
        coachObject=theCoach;
    }

    @Autowired
    public void setCoach(Coach co){
        coSetter=co;

    }
@GetMapping("/work")
    public String getDailyWorkout(){
        return coachObject.getDailyWorkout()+" "+coSetter.getDailyWorkoutSetterInjection();
}

}