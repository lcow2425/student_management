package com.example.studentmanagement.service;

import com.example.studentmanagement.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class StudentServiceTest {

    @Autowired
    private StudentService studentService;

    @Test
    public void testAddStudentIncreasesListSize() {
        int initialSize = studentService.getAllStudents().size();
        Student student = new Student(null, "John Doe", "john@example.com", 20);
        studentService.addStudent(student);
        assertEquals(initialSize + 1, studentService.getAllStudents().size());
    }
}