package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertBike {

	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.setName("Apache");
		bike.setCost(25000);

		Charcy charcy = new Charcy();
		charcy.setType("fvdc");

		charcy.setBike(bike);
		bike.setCharcy(charcy);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();

		entityManager.persist(bike);
		entityManager.persist(charcy);

		entityTransaction.commit();
	}

}
