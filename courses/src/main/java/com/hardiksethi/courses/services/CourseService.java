package com.hardiksethi.courses.services;

import java.util.List;

import com.hardiksethi.courses.entities.Courses;

public interface CourseService {
	public List<Courses> getCourses();
	public Courses getCourse(long courseId);
	public Courses addCourse(Courses course);
	public Courses updateCourse(Courses course);
	public void deleteCourse(long courseId);
}
