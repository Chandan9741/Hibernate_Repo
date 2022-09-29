package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertStudent {

	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Chandan");
		student.setEmail("chandu@gmail.com");

		Course course1 = new Course();
		course1.setName("JAVA");
		course1.setCost(35000);

		Course course2 = new Course();
		course2.setName("PYTHON");
		course2.setCost(20000);

		Course course3 = new Course();
		course3.setName("MERN");
		course3.setCost(20000);

		List<Course> courses = new ArrayList<Course>();
		courses.add(course1);
		courses.add(course2);
		courses.add(course3);

		student.setCourses(courses);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(student);
		entityManager.persist(course1);
		entityManager.persist(course2);
		entityManager.persist(course3);
		entityTransaction.commit();
	}

}
