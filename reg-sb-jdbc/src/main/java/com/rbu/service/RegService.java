package com.rbu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rbu.repo.RegRepo;
import com.rbu.web.Student;

@Service
public class RegService {
	@Autowired
	RegRepo regRepo;
	
	public int create(Student student) {
		
		return regRepo.save(student);
	}

}
