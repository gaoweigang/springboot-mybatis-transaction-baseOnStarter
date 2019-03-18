package com.gwg.demo.mapper;

import com.gwg.demo.model.Student;

public interface StudentMapper {
	
	public Student queryStudentByName(String name);

	public void updateById(Student student);

}
