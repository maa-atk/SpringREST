package com.atk.curddemo.dao;

import com.atk.curddemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student student);

    Student find(int i);

    List<Student> findAll();

    List<Student> findByLastName(String lname);

    Student updateStudents(Student stu);

    void deleteStudent(int i);
}
