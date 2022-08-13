package com.studentsdemo.studentdemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("StudentList")

public class MongodbApplication {

@Id
@Field("id")
    private String id;
    private String firstname;
    private String lastname;
    private String email;
    private String major;
    
    public MongodbApplication(){
    }

    public MongodbApplication(String firstname, String lastname, String email, String major){
        this.firstname=firstname;
        this.lastname=lastname;
        this.email=email;
        this.major=major;
    }

    public String getFName() {
        return firstname;
    }

    public void setFName(String firstname) {
        this.firstname = firstname;
    }

    public String getLName() {
        return lastname;
    }

    public void setLName(String lastname) {
        this.lastname = lastname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
