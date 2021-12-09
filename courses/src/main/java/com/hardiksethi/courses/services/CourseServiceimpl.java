package com.hardiksethi.courses.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hardiksethi.courses.doa.CourseDAO;
import com.hardiksethi.courses.entities.Courses;
@Service
public class CourseServiceimpl implements CourseService {
	
	@Autowired
	private CourseDAO coursedoa;
	//List<Courses> list;
	public CourseServiceimpl() {
		/*
		 * list = new ArrayList<>(); list.add(new Courses(123,"java core",
		 * "this course contains basics of java")); list.add(new
		 * Courses(213,"Spring boot", "rest api using sprint boot"));
		 */
	}
	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		//return list;
		return coursedoa.findAll();
	}
	@Override
	public Courses getCourse(long courseId) {
		// TODO Auto-generated method stub
		/*
		 * Courses c = null; for(Courses course: list) { if(course.getId() == courseId)
		 * { c = course; break; } }
		 */
		return coursedoa.getById(courseId);
	}
	@Override
	public Courses addCourse(Courses course) {
		// TODO Auto-generated method stub
		//list.add(course);
		coursedoa.save(course);
		return course;
	}
	@Override
	public Courses updateCourse(Courses course) {
		/*
		 * list.forEach(e-> { if(e.getId() == course.getId()) {
		 * e.setTitle(course.getTitle()); e.setDescription(course.getDescription()); }
		 * });
		 */
		coursedoa.save(course);
		return course;
	}
	@Override
	public void deleteCourse(long parselong) {
		//list = this.list.stream().filter(e->e.getId()!=parselong).collect(Collectors.toList());
		
		coursedoa.delete(coursedoa.getById(parselong));
		
	}

}
