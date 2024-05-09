package com.rbu.sms.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rbu.sms.domine.Student;

@Repository
public class StudentRepository {
	@Autowired
	SessionFactory sessionFactory;

	public Student save(Student student) {
		Session session = sessionFactory.openSession();
		session.beginTransaction().begin();
		int id = (Integer) session.save(student);
		student.setId(id);
		session.beginTransaction().commit();
		session.close();
		return student;

	}
	public Student update(Student student) {
		Session session = sessionFactory.openSession();
		session.beginTransaction().begin();
		session.update(student);
		session.beginTransaction().commit();
		session.close();
		return student;

	}
	public Student delete(Student student) {
		Session session = sessionFactory.openSession();
		session.beginTransaction().begin();
		session.delete(student);
		session.beginTransaction().commit();
		session.close();
		return student;

	}
	
	public Student findOneByGet(int id) {
		Session session = sessionFactory.openSession();
		Student student=(Student)session.get(Student.class,id);
		session.close();
		return student;

	}
	
	public Student findOneByLoad(int id) {
		Session session = sessionFactory.openSession();
		Student student=(Student)session.load(Student.class,id);
		session.close();
		return student;
	}
	
	public List<Student> findAllHQL() {
		Session session = sessionFactory.openSession();
		String hql="from Student";//select * from STDUENT_HIB
		Query query=session.createQuery(hql);
		List<Student> list=query.list();
		session.close();
		return list;
	}
	public List<Student> findAllCriteria() {
		Session session = sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Student.class);
		List<Student> list=criteria.list();
		session.close();
		return list;
	}
	
	public List<Student> findAllSQL() {
		Session session = sessionFactory.openSession();
		SQLQuery query=session.createSQLQuery("select * from STUDENT_HIB");
		List<Student> list=query.list();
		session.close();
		return list;
	}

}
