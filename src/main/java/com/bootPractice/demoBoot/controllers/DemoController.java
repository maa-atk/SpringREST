package com.bootPractice.demoBoot.controllers;
import com.bootPractice.demoBoot.interfaces.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach coachObject;
    @Autowired
    public DemoController (Coach theCoach){
        coachObject=theCoach;
    }
@GetMapping("/work")
    public String getDailyWorkout(){
        return coachObject.getDailyWorkout();
}

}