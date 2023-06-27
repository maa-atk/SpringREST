package com.atk.curddemo.dao;

import com.atk.curddemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student student);

    Student find(int i);

    List<Student> findAll();
}
