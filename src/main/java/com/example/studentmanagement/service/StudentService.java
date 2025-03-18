package com.example.studentmanagement.service;

import com.example.studentmanagement.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private List<Student> students = new ArrayList<>();
    private Integer nextId = 1;

    public List<Student> getAllStudents() {
        return students;
    }

    public void addStudent(Student student) {
        student.setId(nextId++);
        students.add(student);
    }

    public void deleteStudent(Integer id) {
        students.removeIf(student -> student.getId().equals(id));
    }
}