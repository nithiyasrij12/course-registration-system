package com.example.course_registration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import jakarta.persistence.Id;

@Entity
@Data

public class Enrollment {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private Student student;
    @ManyToOne
    private Course course;
}
