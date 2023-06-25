package com.bootPractice.demoBoot.beans;

import com.bootPractice.demoBoot.interfaces.Coach;

public class SwimCoach implements Coach  {


        public SwimCoach() {
            System.out.println("swim Constr");
        }
        @Override
        public String getDailyWorkout() {
            return "Swim 1km";
        }



}
