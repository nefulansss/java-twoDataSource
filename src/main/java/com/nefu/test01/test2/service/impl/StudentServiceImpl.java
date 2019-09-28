package com.nefu.test01.test2.service.impl;

import com.nefu.test01.pojo.Student;
import com.nefu.test01.test2.mapper.StudentMapper;
import com.nefu.test01.test2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public boolean insertStudent(Student student) {
        return studentMapper.insertStudent(student);
    }
}
