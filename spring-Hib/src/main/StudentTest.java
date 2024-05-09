package main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rbu.sms.dao.StudentRepository;
import com.rbu.sms.domine.Student;

public class StudentTest {
	public static void main(String[] args) {

		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/test.xml");
		StudentRepository studentRepository = ap.getBean(StudentRepository.class);

//		Student student = new Student();
//		//student.setId(1);
//		student.setName("ganesh");
//		student.setEmail("ganesh@ymail.com");
//		student.setAddress("HYD");
//
//		
//
//		Student student2 = new Student();
//		//student.setId(1);
//		student2.setName("archana");
//		student2.setEmail("archana@ymail.com");
//		student2.setAddress("HYD");
//
//		
//		Student student3 = new Student();
//		//student.setId(1);
//		student3.setName("nirmal");
//		student3.setEmail("nirmal@ymail.com");
//		student3.setAddress("HYD");
//
//		studentRepository.save(student);
//		studentRepository.save(student2);
		// studentRepository.save(student3);
System.out.println("Criteria");
		List<Student> list = studentRepository.findAllCriteria();

		for (Student std : list) {
			System.out.println(std);
		}
		System.out.println("HQL");
		List<Student> list2 = studentRepository.findAllHQL();

		for (Student std : list2) {
			System.out.println(std);
		}
		System.out.println("SQL");
		List<Student> list3 = studentRepository.findAllSQL();

		for (Student std : list3) {
			System.out.println(std);
		}

	}
}
