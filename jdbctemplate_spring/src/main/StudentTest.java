package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rbu.sms.repo.StudentRepository;
import com.rbu.sms.repo.StudentRepository2;

public class StudentTest {
public static void main(String[] args) {
	
	ApplicationContext ap=new ClassPathXmlApplicationContext("resources/test.xml");
	StudentRepository std=ap.getBean(StudentRepository.class);
	//std.save(3,"christoper","christoper@gmail.com", "HYD");
	StudentRepository2 std2=ap.getBean(StudentRepository2.class);
	//std2.save(2,"pavan","pavan@gmail.com", "HYD");
	
	
	//jt
	//std.find(1);
	//std.findAll();
	//npjt
	//std.find(2);
	std2.findAll();
	
	
	
	
	
}
}
