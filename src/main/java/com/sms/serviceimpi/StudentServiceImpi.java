package com.sms.serviceimpi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.entity.Student;
import com.sms.repository.StudentRepository;
import com.sms.service.StudentService;

@Service //denotes what role this class will play
public class StudentServiceImpi implements StudentService{

	@Autowired
	StudentRepository stdRepository;
	
	@Override
	public String createStudent(Student student) {
		
		String user = student.getEmail().substring(0,student.getEmail().indexOf("@"));
		student.setUserName(user);
		
		String pass = student.getName().substring(0,3).toLowerCase();
		student.setPassword(pass+"123");
		
		stdRepository.save(student); //saving the object to the database
		
		return "Student details saved successfully!";
	}

	@Override
	public Student saveStudent(Student student) {
		
		String user = student.getEmail().substring(0,student.getEmail().indexOf("@"));
		student.setUserName(user);
		
		String pass = student.getName().substring(0,3).toLowerCase();
		student.setPassword(pass+"123");
		
		stdRepository.save(student); //saving the object to the database
		
		return student;
	}
	
	@Override
	public Student getStudentById(int stdId)
	{
		Student std = stdRepository.findById(stdId).get();
		
		return std;
	}
}