package com.gwg.demo.service;

import com.gwg.demo.mapper.CourseMapper;
import com.gwg.demo.mapper.StudentMapper;
import com.gwg.demo.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gwg.demo.model.Student;

@Component
public class StudentService {
	
	@Autowired(required=true)
	private StudentMapper studentMapper;


	@Autowired
	private CourseMapper courseMapper;
	

	@Transactional
	public void updateStudent(){
		Student stud = new Student();
		stud.setId(1);
		stud.setName("高伟刚122");
		studentMapper.updateById(stud);
		int i = 1/0;
		Course course = new Course();
		course.setId(1);
		course.setName("数学122");
		courseMapper.updateById(course);
	}

}
