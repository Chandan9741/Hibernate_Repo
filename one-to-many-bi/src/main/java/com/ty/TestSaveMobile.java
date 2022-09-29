package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveMobile {

	public static void main(String[] args) {
    Mobile mobile=new Mobile();
    mobile.setName("Vivo");
    mobile.setCost(25000);
    
   
    Sim sim1=new Sim();
    sim1.setName("JIO sim");
    sim1.setProvider("JIO");
    
    Sim sim2=new Sim();
    sim2.setName("Idea sim");
    sim2.setProvider("idea");
    
    List<Sim> sims=new ArrayList<Sim>();
    sims.add(sim1);
    sims.add(sim2);
    
    mobile.setSims(sims);
    sim1.setMobile(mobile);
    sim2.setMobile(mobile);
    
    EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
    entityTransaction.begin();
    
    entityManager.persist(mobile);
    entityManager.persist(sim1);
    entityManager.persist(sim2);
    
    entityTransaction.commit();
    
	}

}
