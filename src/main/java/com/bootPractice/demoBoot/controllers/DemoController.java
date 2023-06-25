package com.bootPractice.demoBoot.controllers;
import com.bootPractice.demoBoot.interfaces.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach coachObject;
    private Coach coSetter;
    @Autowired
    public DemoController (@Qualifier("cricketCoach") Coach theCoach){
        coachObject=theCoach;
    }

    @Autowired
    public void setCoach(@Qualifier("footBallCoach") Coach co){
        coSetter=co;

    }

//or directly use without any methods or constructors
    @Autowired
    private  Coach coachdFieldInjectedl;
@GetMapping("/work")
    public String getDailyWorkout(){
        return coachObject.getDailyWorkout()+" "+coSetter.getDailyWorkout()+" "+ coachdFieldInjectedl.getDailyWorkout();
}

}