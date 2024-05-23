package com.rbu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rbu.domine.Student;
import com.rbu.repo.StudentRepo;

@Service
public class RegService {
	@Autowired
	StudentRepo regRepo;
	
	public Student create(Student student) {
		return regRepo.save(student);
	}

}
