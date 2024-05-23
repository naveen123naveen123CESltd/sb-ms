package com.rbu.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rbu.domine.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
	//@Query(nativeQuery = true,value="select * from STUDENT_RBU");
	public List<Student> findByEmailAndAddress(String email,String address);
	public List<Student> findByName(String name);
	public List<Student> findByAddress(String address);
	//how to write custom queries in JPA 
	//native queries EntityManagerFactory
	//@Query(HQL)
	//@Query
}
