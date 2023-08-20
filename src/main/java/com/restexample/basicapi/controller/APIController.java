package com.restexample.basicapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restexample.basicapi.model.Course;
import com.restexample.basicapi.service.CourseService;

@RestController
public class APIController {
	
	@Autowired
	private CourseService courseService;
	
	
	@GetMapping("/home")
	public String home() {
		
		return "This is home page";
	}

	
	@GetMapping("/courses")
	public List<Course> getCourses (){
		return this.courseService.getCourses();
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse( @PathVariable String courseId) {
		return this.courseService.getSingleCourse(courseId);
	}
	
	@PostMapping("/courses")
	public String addCourse(@RequestBody Course course) {
		
		if (this.courseService.addCourse(course)) {
		
			return "Success";
		}else {
			return "Failed";
		}
	}
}
