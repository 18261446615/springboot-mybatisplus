package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.component.StudentComponent;
import com.demo.domian.Student;

@Service("studentService")
public class StudentService {

	@Autowired
	StudentComponent studentComponent;
	
	public Student queryStudentById(int id) {
		
		return studentComponent.queryStudentById(id);
	}

	public Student queryStudentOne(Student student) {
		
		return studentComponent.queryStudentOne(student);
	}


}
