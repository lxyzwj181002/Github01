package com.org.service;

import com.org.domain.student;

import java.util.List;

public interface StudentService {
    int addStudent(student stu);
    List<student> findStudent();
}
