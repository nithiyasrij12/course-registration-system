package com.example.course_registration.controller;

import com.example.course_registration.model.Enrollment;
import com.example.course_registration.services.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/enrollments")
@CrossOrigin(
        origins="http://127.0.0.1:5500/",
        methods={RequestMethod.GET, RequestMethod.POST}

)
public class EnrollmentController {
    @Autowired
    public EnrollmentService enrollmentService;
    public EnrollmentController(EnrollmentService enrollmentService){
        this.enrollmentService=enrollmentService;
    }
    @PostMapping
    public Enrollment enroll(@RequestParam long studentId, @RequestParam long courseId){
        return enrollmentService.enrolledStudents(studentId,courseId);
    }
    @GetMapping
    public List<Enrollment> getAll(){
        return enrollmentService.getAllEnrollments();
    }
}
