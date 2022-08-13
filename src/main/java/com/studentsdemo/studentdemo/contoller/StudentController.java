package com.studentsdemo.studentdemo.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.studentsdemo.studentdemo.exception.NotFoundException;
import com.studentsdemo.studentdemo.model.MongodbApplication;
import com.studentsdemo.studentdemo.repository.StudentRepo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

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
@RequestMapping("/student")
public class StudentController {
@Autowired
    private StudentRepo studentRepository;
    // public StudentController(StudentRepo studentRepo) {
    //     this.studentRepository= studentRepo;
    // }

// @GetMapping("/student")
public List<MongodbApplication> getAllStudents(){
    return studentRepository.findAll();
}
//build create students list
// @PostMapping("/student")
public MongodbApplication createStudent(@RequestBody MongodbApplication studentList){

    // MongodbApplication studList= new MongodbApplication();

    // studList.setFName("Name 1");
    // studList.setLName("Name 2");
    // studList.setEmail("name1@gmail.com");
    // studList.setMajor("science");
    // studentRepository.save(studList);

    // studList.setFName(studentList.getFName());
    // studList.setLName(studentList.getLName());
    // studList.setEmail(studentList.getEmail());
    // studList.setMajor(studentList.getMajor());
    // return studentRepository.save(studList);


    return studentRepository.save(studentList);
}

//build get Student by id REST API

// public ResponseEntity<MongodbApplication>getStudentById(long id){
//     MongodbApplication student=studentRepository.findById(id).orElseThrow(()->
//     new NotFoundException("Employee doesnt exist with the id:" + id));
//     return ResponseEntity.ok(student);
// }


//build update REST Api

// @PutMapping("{id}")
// public ResponseEntity<MongodbApplication> updateStudent(@PathVariable int id, @RequestBody MongodbApplication studentDetails){

//     MongodbApplication updateStudent= studentRepository.findById(id).orElseThrow(()->
//     new NotFoundException("Employee not exist with id:"+ id));
//     updateStudent.setFName(studentDetails.getFName());
//     updateStudent.setLName(studentDetails.getLName());
//     updateStudent.setEmail(studentDetails.getEmail());
//     updateStudent.setMajor(studentDetails.getMajor());
//     studentRepository.save(updateStudent);
//     return ResponseEntity.ok(updateStudent);
// }

//deleting student list 
@DeleteMapping("{id}")
public ResponseEntity<HttpStatus>deleteStudent(@PathVariable int id){
    MongodbApplication students= studentRepository.findById(id).orElseThrow(()->
    new NotFoundException("Employee Not Exist"+ id));
    studentRepository.delete(students);

    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
}

}

