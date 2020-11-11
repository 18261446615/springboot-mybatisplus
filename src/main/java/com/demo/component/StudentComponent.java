package com.demo.component;

import com.demo.domian.Student;


public interface StudentComponent {

	public abstract Student queryStudentById(Integer id);
	
	public abstract Student queryStudentOne(Student student);
	
}
