package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
@Autowired
private StudentService studentService;
@PostMapping("/save")
public ResponseEntity<Student>saveStudent(@RequestBody  Student student){
	Student stud=studentService.saveStudent(student);
	return ResponseEntity.ok().body(stud);
}
@GetMapping("/get/{id}")
public ResponseEntity<Student>getStudent(@PathVariable("id")Integer id){
	Student stud=studentService.getStudent(id);
	return ResponseEntity.ok().body(stud);
}
@PutMapping("/update")
public void updateStudent(@RequestBody Student student) {
	studentService.updateStudent(student);
}
@GetMapping("/get/{lastname}")
public ResponseEntity<List<Student>>getListStudent(@PathVariable("lastname") String lastname){
	List<Student>stu=studentService.getListStudent(lastname);
	return ResponseEntity.ok().body(stu);
}
@DeleteMapping("/delete/{id}")
public void deleteStudent(@PathVariable("id")Integer id) {
	studentService.deleteStudent(id);
}

}
