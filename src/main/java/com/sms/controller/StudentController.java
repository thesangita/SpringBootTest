package com.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sms.entity.Student;
import com.sms.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService stdService;
	
	@PostMapping("/createStudent")
	public String createStudent(@RequestBody Student std)
	{
		return stdService.createStudent(std);
	}
	
	@PostMapping("/saveStudent")
	public Student saveStudent(@RequestBody Student std)
	{
		return stdService.saveStudent(std);
	}
	
	@GetMapping("/getStudent/{id}")
	public Student getStudentById(@PathVariable("id") int id)
    {
    	return stdService.getStudentById(id);
	
    }
}