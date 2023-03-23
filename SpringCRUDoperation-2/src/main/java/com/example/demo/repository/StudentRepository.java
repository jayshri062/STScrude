package com.example.demo.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;
@Repository
public interface StudentRepository extends CrudRepository<Student,Serializable>{
public Student findById(Integer id);
@Query(value="select * from student c where lastname=?1", nativeQuery =true)
List<Student> findBylastname(String lastname);
}
