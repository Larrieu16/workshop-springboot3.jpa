package com.larrieu.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.larrieu.course.entities.User;

@SpringBootApplication
public class CourseApplication {
	public static void main(String[] args) {
		SpringApplication.run(CourseApplication.class, args);
	}
	
}
