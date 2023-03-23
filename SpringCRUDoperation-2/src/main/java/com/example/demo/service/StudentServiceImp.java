package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
@Service
public class StudentServiceImp implements StudentService{
@Autowired
private StudentRepository studentRepository;
	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}
	@Override
	public Student getStudent(Integer id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id);
	}
	@Override
	public Student updateStudent(Student student) {
		Integer id=student.getId();
		student.setFirstname(student.getFirstname());
		student.setLastname(student.getLastname());
		return studentRepository.save(student);
	}
	@Override
	public List<Student> getListStudent(String lastname) {
		
		return studentRepository.findBylastname(lastname);
	}
	@Override
	public void deleteStudent(Integer id) {
		studentRepository.deleteById(id);
	}
	
}
