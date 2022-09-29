package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveFoodOrder {

	public static void main(String[] args) {

		FOrder foodOrder = new FOrder();
		foodOrder.setStatusN("Preparing");
		foodOrder.setToName("abc");

		Item item = new Item();
		item.setName("qqq");
		item.setQuantity(1);
		item.setCost(23);
		List<Item> list = new ArrayList<Item>();
		list.add(item);
		foodOrder.setItems(list);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		System.out.println(entityManagerFactory);

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(foodOrder);
		entityManager.persist(item);
		entityTransaction.commit();

	}

}
