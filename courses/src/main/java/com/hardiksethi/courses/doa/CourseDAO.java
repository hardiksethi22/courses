package com.hardiksethi.courses.doa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hardiksethi.courses.entities.Courses;
@Repository
public interface CourseDAO extends JpaRepository<Courses, Long>{
	
}
