package com.microservice.student.microservice_student.persistence;

import com.microservice.student.microservice_student.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.concurrent.CountDownLatch;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("SELECT s FROM Student s WHERE s.courseId = :courseId")
    List<Student> findAllStudents(Long courseId);
    List<Student> findAllByCourseId(Long courseId);
}
