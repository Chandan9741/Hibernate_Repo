package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertTeacher {

	public static void main(String[] args) {
    Teacher teacher=new Teacher();
    teacher.setName("vikas");
    teacher.setGender("male");
    
    Subject subject=new Subject();
    subject.setName("JAVA");
    subject.setDays(60);
    
    Subject subject2=new Subject();
    subject2.setName("PYTHON");
    subject2.setDays(30);
    
    Subject subject3=new Subject();
    subject3.setName("MERN");
    subject3.setDays(50);
    
    List<Subject> subjects=new ArrayList<Subject>();
    subjects.add(subject);
    subjects.add(subject2);
    subjects.add(subject3);
    
    teacher.setSubjects(subjects);
    
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.persist(teacher);
	entityManager.persist(subject);
	entityManager.persist(subject2);
	entityManager.persist(subject3);
	entityTransaction.commit();

    
	}

}
