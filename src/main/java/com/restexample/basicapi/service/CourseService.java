package com.restexample.basicapi.service;

import java.util.List;

import com.restexample.basicapi.model.Course;

public interface CourseService {
	
	public List<Course> getCourses();

	public Course getSingleCourse(String courseId);

	public boolean addCourse(Course course);
	
}
