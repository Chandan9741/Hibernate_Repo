package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestsavePerson {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();

		Person person=	new Person();
		person.setName("chandan");
		person.setGender("male");

		Pan pan=new Pan();
		pan.setNumber("APGI952");
		pan.setType("Business");
		
		pan.setPerson(person);
		person.setPan(pan);

		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(person); 
		entityManager.persist(pan);
		entityTransaction.commit();
	}

}
