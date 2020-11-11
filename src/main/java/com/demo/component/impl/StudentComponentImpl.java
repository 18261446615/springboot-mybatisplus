package com.demo.component.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.component.StudentComponent;
import com.demo.domian.Student;
import com.demo.mapper.StudentMapper;

@Component
public class StudentComponentImpl implements StudentComponent{

	@Autowired
	StudentMapper studentMapper;

	@Override
	public Student queryStudentById(Integer id) {
		
		return studentMapper.selectById(id);
	}

	@Override
	public Student queryStudentOne(Student student) {
		
		return studentMapper.selectOne(student);
	}

	
}
