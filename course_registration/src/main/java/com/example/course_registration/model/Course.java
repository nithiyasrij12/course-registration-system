package com.example.course_registration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import jakarta.persistence.Id;

@Entity
@Data
public class Course {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String courseName;
    private String courseTrainer;
}
