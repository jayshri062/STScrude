package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService {
public Student saveStudent(Student student);
public Student getStudent(Integer id);
public Student updateStudent(Student student);
public List<Student>getListStudent(String lastname);
public void deleteStudent(Integer id);
}
