package com.atk.curddemo;

import com.atk.curddemo.dao.StudentDAO;
import com.atk.curddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CurddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurddemoApplication.class, args);
	}
	//creating a cmd based app will be run after all the beans are created
	@Bean
	public CommandLineRunner commandLineRunner (StudentDAO studentDAO) {
		return runner -> {
			//createStudent(studentDAO);
			//findStudent(studentDAO);
			//findByLastName(studentDAO);
			updateStudent(studentDAO);

		};
	}

	private void updateStudent(StudentDAO studentDAO) {
		//change lastname of every entry to the lastname tester
		//returns the num of rows updated
		Student result= studentDAO.find(1);
		result.setFirstName("huehue");
		studentDAO.updateStudents(result);
	}

	private void findByLastName(StudentDAO studentDAO) {
		List<Student> result= studentDAO.findByLastName("lastTest");
		System.out.println(result);
	}

	private void findAllStudent(StudentDAO studentDAO) {
		List<Student> result= studentDAO.findAll();
		System.out.println(result);
	}

	private void findStudent(StudentDAO studentDAO) {
		System.out.println(studentDAO.find(1));
	}

	private void createStudent(StudentDAO studentDAO) {
		Student student= new Student("testName", "lastTest","email@email");
		//saving the student
			studentDAO.save(student);
		//print the id made by the db
			System.out.println(student.getId());
	}
}
