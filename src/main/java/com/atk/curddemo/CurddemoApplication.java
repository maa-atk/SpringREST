package com.atk.curddemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CurddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurddemoApplication.class, args);
	}
	//creating a cmd based app will be run after all the beans are created
	@Bean
	public CommandLineRunner commandLineRunner (String[] args){
		return runner->{
			System.out.println("App start");
		};
		}
}
