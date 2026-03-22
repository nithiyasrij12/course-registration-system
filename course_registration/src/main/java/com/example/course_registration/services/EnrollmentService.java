package com.example.course_registration.services;

import com.example.course_registration.model.Course;
import com.example.course_registration.model.Enrollment;
import com.example.course_registration.model.Student;
import com.example.course_registration.repository.CourseRepository;
import com.example.course_registration.repository.EnrollmentRepository;
import com.example.course_registration.repository.StudentRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class EnrollmentService {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    CourseRepository courseRepository;
    @Autowired
    EnrollmentRepository enrollmentRepository;

    public Enrollment enrolledStudents(long stdId,long courseId){
        Student student= studentRepository.findById(stdId).orElseThrow();
        Course course=courseRepository.findById(courseId).orElseThrow();
        Enrollment enrollment=new Enrollment();
        enrollment.setStudent(student);
        enrollment.setCourse(course);
        return  enrollmentRepository.save(enrollment);

    }

    public List<Enrollment>getAllEnrollments(){
        return enrollmentRepository.findAll();
    }
}
