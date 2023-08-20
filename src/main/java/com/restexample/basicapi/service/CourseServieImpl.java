package com.restexample.basicapi.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.restexample.basicapi.model.Course;

@Service
public class CourseServieImpl implements CourseService{
	
	List<Course> list;
	
	public CourseServieImpl() {
		
		list = new ArrayList<>();
		list.add(new Course(0, "Physics", "Electrostatics"));
		list.add(new Course(1, "Physics", "Electrostatics"));
		list.add(new Course(2, "Physics", "Electrostatics"));
		list.add(new Course(3, "Physics", "Electrostatics"));
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getSingleCourse(String courseId) {
		// TODO Auto-generated method stub
		for(int i =0;i<list.size(); i++) {
			
			Course course = list.get(i);
			
			if (String.valueOf(course.getId()).equals(courseId)) {
				return course;
			}
		}
		
		return null;
	}

	@Override
	public boolean addCourse(Course course) {
		
		try {
			list.add(course);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
