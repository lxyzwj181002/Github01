package com.org.service.impl;

import com.org.dao.StudentDao;
import com.org.domain.student;
import com.org.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    //引用类型，自动注入，@Autowired，@Resource
    @Autowired
    private StudentDao studentdao;
    @Override
    public int addStudent(student stu) {
        return studentdao.insertStudent(stu);
    }
    @Override
    public List<student> findStudent() {
        return studentdao.selectStudent();
    }
}
