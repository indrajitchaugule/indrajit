package com.springrest.springrest.srevices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CoursesService {
	
	List<Course> list;
	
	public CourseServiceImpl()
	{
		list= new ArrayList<>();
		list.add(new Course(145,"java core Courses","This courses contain basic of java "));
		list.add(new Course(451,"Spring boot course","Creating rest api using spring boot"));
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

}
