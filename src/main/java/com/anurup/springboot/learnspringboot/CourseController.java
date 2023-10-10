package com.anurup.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourse() {
		return Arrays.asList(
				new Course(1, "Learn AWS", "Anurup"),
				new Course(2, "Learn DevOps", "Anurup"),
				new Course(3, "Learn Azure", "Anurup"),
				new Course(4, "Learn GCP", "Anurup")
				);
	}

}
