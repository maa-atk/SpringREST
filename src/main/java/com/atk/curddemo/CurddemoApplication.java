package com.atk.curddemo;

import com.atk.curddemo.dao.StudentDAO;
import com.atk.curddemo.entity.Student;
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
	public CommandLineRunner commandLineRunner (StudentDAO studentDAO) {
		return runner -> {
			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {
		Student student= new Student("testName", "lastTest","email@email");
		//saving the student
			studentDAO.save(student);
		//print the id made by the db
			System.out.println(student.getId());
	}
}
