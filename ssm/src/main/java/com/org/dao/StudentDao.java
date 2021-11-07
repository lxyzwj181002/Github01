package com.org.dao;

import com.org.domain.student;

import java.util.List;

public interface StudentDao {
    public int insertStudent(student stu);
    public List<student> selectStudent();
}
