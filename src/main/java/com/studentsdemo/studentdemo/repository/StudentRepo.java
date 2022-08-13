package com.studentsdemo.studentdemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.studentsdemo.studentdemo.model.MongodbApplication;

public interface StudentRepo extends MongoRepository<MongodbApplication, Integer> {
    
}
