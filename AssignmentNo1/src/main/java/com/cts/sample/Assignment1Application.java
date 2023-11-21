package com.cts.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Assignment1Application {

	public static void main(String[] args) {
		SpringApplication.run(Assignment1Application.class, args);
		
StudentService studentService=new StudentService();
		
		Student s1=new Student(1L, "John", 80);
		Student s2=new Student(2L, "Smith", 90);
		
		studentService.addStudent(s1);
		studentService.addStudent(s2);
		
		System.out.println("All students");
		studentService.getAllStudents();
		
		studentService.updateScore(1L, 85);
		studentService.updateScore(2L, 95);
		
		studentService.deleteStudent(1L);
		
		System.out.println("students after removal:");
		studentService.getAllStudents().forEach(System.out::println);
		
	}

}
