package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertStudent2 {

	public static void main(String[] args) {
		Student student2 = new Student();
		student2.setName("chethan");
		student2.setEmail("chethu@gmail.com");

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Course course = entityManager.find(Course.class, 1);
		Course course1 = entityManager.find(Course.class, 3);

		List<Course> courses = new ArrayList<Course>();
		courses.add(course);
		courses.add(course1);
		
		student2.setCourses(courses);
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(student2);
		entityManager.persist(course);
		entityManager.persist(course1);
		entityTransaction.commit();
	}

}
