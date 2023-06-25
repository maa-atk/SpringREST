package com.bootPractice.demoBoot.config;

import com.bootPractice.demoBoot.beans.SwimCoach;
import com.bootPractice.demoBoot.interfaces.Coach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    //bean id used as the name for the function by default
    //or use @Bean("customBeanID")
    @Bean
    public Coach swimCoach(){
        return new SwimCoach();

    }
}
