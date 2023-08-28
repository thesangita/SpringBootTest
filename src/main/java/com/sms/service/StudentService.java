package com.sms.service;

import com.sms.entity.Student;

public interface StudentService {

	//method used to save student details into the database
	String createStudent(Student student);
	
	Student saveStudent(Student student);
	
	Student getStudentById(int stdId);
}
