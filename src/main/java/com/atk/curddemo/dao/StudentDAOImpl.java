package com.atk.curddemo.dao;

import com.atk.curddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImpl implements StudentDAO{
    private EntityManager entityManager;
    @Autowired
    public void StudentDAOImpl(EntityManager et){
        entityManager=et;
    }
    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }
}
