package com.example.course_registration.services;

import com.example.course_registration.model.Course;
import com.example.course_registration.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseService {
    @Autowired
    CourseRepository courseRepository;
    public CourseService(CourseRepository courseRepository){
        this.courseRepository=courseRepository;
    }
    public List<Course> getAllCourse(){
        return courseRepository.findAll();
    }
}
