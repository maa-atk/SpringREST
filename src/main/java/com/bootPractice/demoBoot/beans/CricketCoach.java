package com.bootPractice.demoBoot.beans;

import com.bootPractice.demoBoot.interfaces.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("CricketCoach Constr");
    }
@PostConstruct
        public void startUpMethod(){
        System.out.println("after creation of bean");
}
    @PreDestroy
    public void beforeDestroyMethod(){
        System.out.println("for bean clean up after stop application");
    }
    @Override
    public String getDailyWorkout() {
        return "Practice Bowl 10min ";
    }

}
