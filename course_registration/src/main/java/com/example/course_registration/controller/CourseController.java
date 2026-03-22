package com.example.course_registration.controller;

import com.example.course_registration.model.Course;
import com.example.course_registration.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@CrossOrigin(
        origins = "http://127.0.0.1:5500/",
        methods = {RequestMethod.GET ,RequestMethod.POST}
)
public class CourseController {
@Autowired
CourseService courseService;
public CourseController(CourseService courseService){
    this.courseService=courseService;
}
@GetMapping
    public List<Course> getAll(){
    return courseService.getAllCourse();
}

}
