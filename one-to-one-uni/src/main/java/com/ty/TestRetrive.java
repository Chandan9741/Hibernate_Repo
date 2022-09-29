package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestRetrive {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Person person = entityManager.find(Person.class, 1);
		if(person!=null) {
			System.out.println("----Person info---");
			System.out.println("Id: " + person.getId());
			System.out.println("name: " + person.getName());
			System.out.println("gender: " + person.getGender());
		}
		else {
			System.out.println("id not found");
		}


		Pan pan = person.getPan();
		if (pan != null) {
			System.out.println("======Pan info=====");
			System.out.println("pan id: " + pan.getId());
			System.out.println("pan number: " + pan.getNumber());
			System.out.println("pan type: " + pan.getType());
		}
	}
}
