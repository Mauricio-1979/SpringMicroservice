package com.microservice.student.microservice_student.services;

import com.microservice.student.microservice_student.entities.Student;

import java.util.List;

public interface IStudentService {

    List<Student> findAll();

    Student findById(Long id);

    void save(Student student);

    // Este metodo es lladado desde el microservicio course
    List<Student> findByIdCourse(Long courseId);
}
