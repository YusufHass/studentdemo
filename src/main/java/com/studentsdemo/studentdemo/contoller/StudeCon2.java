package com.studentsdemo.studentdemo.contoller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.studentsdemo.studentdemo.model.MongodbApplication;
import com.studentsdemo.studentdemo.repository.StudentRepo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/* // @CrossOrigin with a wildcard makes the application run and respond or communicate
into differnt ports such as her
in port 8000 and port 3000 at the same time. Otherwise when we run both application at the same time
then running react at the local host 3000 display an errors. (*) means the spring port 8000 is allowed to communicate 
with any ports  */
@CrossOrigin("*")

/*
if we want the spring boot communicate with only to specific port such as port 3000 then we say
 @CrossOrigin(origins:{"http://localhost:3000/"} )
 */
@RestController
public class StudeCon2{
    private final StudentRepo studentRepository;
    public StudeCon2(StudentRepo studentRepo) 
    {
        this.studentRepository= studentRepo;
    }

@GetMapping("/student")
public ResponseEntity<List<MongodbApplication>>getAllStudents(){
    return ResponseEntity.ok(this.studentRepository.findAll());
}
@PostMapping("/student")
public ResponseEntity<MongodbApplication>createStudent(@RequestBody MongodbApplication studentList){

    MongodbApplication studList= new MongodbApplication();

    // studList.setFName("Name 1");
    // studList.setLName("Name 2");
    // studList.setEmail("name1@gmail.com");
    // studList.setMajor("science");
    // studentRepository.save(studList);

    studList.setFName(studentList.getFName());
    studList.setLName(studentList.getLName());
    studList.setEmail(studentList.getEmail());
    studList.setMajor(studentList.getMajor());

    return ResponseEntity.status(201).body(this.studentRepository.save(studList));
}

}

