package com.khan.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khan.entity.Student;
import com.khan.repository.StudentRepository;

@Repository
public class StudentDAO {

	@Autowired
	private StudentRepository studentRepository;

	public void batchStore(List<Student> studentList) {
		studentRepository.save(studentList);
	}


	public Student getStudentDetail(String mobileNo) {
		
		return studentRepository.findByPhoneNumber(mobileNo);
	}
}
