package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RetriveMobile {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Mobile mobile=entityManager.find(Mobile.class, 2);
		if(mobile!=null) {
	     System.out.println(mobile.getId());
	     System.out.println(mobile.getName());
	     System.out.println(mobile.getCost());
		}
		
		List<Sim> sims=mobile.getSims();
		
     if(sims!=null) {
    	 for(Sim s: sims) {
    		 System.out.println(s.getId());
    		 System.out.println(s.getName());
    		 System.out.println(s.getProvider());
    		 System.out.println("****************************");
    	 }
     }
}
	
}
