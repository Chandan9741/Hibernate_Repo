package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RetriveBike {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Charcy charcy = entityManager.find(Charcy.class, 1);
		if (charcy != null) {
			System.out.println("************CHASIS DETAILS**********");
			System.out.println(charcy.getId());
			System.out.println(charcy.getType());
		}

		Bike bike = charcy.getBike();
		System.out.println("*************BIKE DETAILS**********");
		System.out.println(bike.getId());
		System.out.println(bike.getName());
		System.out.println(bike.getCost());

	}

}
