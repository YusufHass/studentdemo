package com.studentsdemo.studentdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.studentsdemo.studentdemo.model.MongodbApplication;
// import com.studentsdemo.studentdemo.model.MongodbApplication;
import com.studentsdemo.studentdemo.repository.StudentRepo;

@SpringBootApplication
public class StudentdemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentdemoApplication.class, args);
	}
@Autowired
private StudentRepo studentRepo;
@Override
public void run(String... args) throws Exception {


	// MongodbApplication student1= new MongodbApplication();
	// student1.setId(1);
	// student1.setFName("Stud1");
	// student1.setLName("stud1");
	// student1.setEmail("stud1@email.com");
	// student1.setMajor("Java");
	// studentRepo.save(student1);
	// MongodbApplication student2= new MongodbApplication();
	// student2.setId(2);
	// student2.setFName("stud2");
	// student2.setLName("stud2");
	// student2.setEmail("stud2@email.com");
	// student2.setMajor("C++");
	// studentRepo.save(student2);
	// MongodbApplication student3= new MongodbApplication();
	// student3.setId(3);
	// student3.setFName("stud3");
	// student3.setLName("stud3");
	// student3.setEmail("stud3@email.com");
	// student3.setMajor("Computer Science");
	// studentRepo.save(student3);
	// MongodbApplication student4= new MongodbApplication();
	// student4.setId(4);
	// student4.setFName("stud4");
	// student4.setLName("stud4");
	// student4.setEmail("stud4@email.com");
	// student4.setMajor("React");
	// studentRepo.save(student4);


}


}
