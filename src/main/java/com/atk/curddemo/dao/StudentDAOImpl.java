package com.atk.curddemo.dao;

import com.atk.curddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    @Override
    public Student find(int i) {
        return entityManager.find(Student.class,i);
    }

    @Override
    public List<Student> findAll() {
        // find all the students
//        TypedQuery<Student> studentTypedQuery= entityManager.createQuery("From Student",Student.class);

        //order by the lastname
                TypedQuery<Student> studentTypedQuery= entityManager.createQuery("From Student order by lastName",Student.class);
        return studentTypedQuery.getResultList();
    }

    @Override
    public List<Student> findByLastName(String lname) {

        TypedQuery<Student> studentTypedQuery= entityManager.createQuery("From Student WHERE lastName=:theData",Student.class);
        studentTypedQuery.setParameter("theData",lname);
        return studentTypedQuery.getResultList();
    }

    @Override
    @Transactional
    public Student updateStudents(Student stu) {
        return entityManager.merge(stu);

    }
}
