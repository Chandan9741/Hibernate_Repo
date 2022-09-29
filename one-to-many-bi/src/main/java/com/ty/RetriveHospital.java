package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RetriveHospital {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Hospital hospital = entityManager.find(Hospital.class, 1);
		if (hospital != null) {
			System.out.println("***********HOSPITAL DETAILS**********");
			System.out.println(hospital.getId());
			System.out.println(hospital.getName());
			System.out.println(hospital.getWebsite());
		}
		List<Branch> branchs=hospital.getBranchs();	
		if(branchs!=null) {
			for(Branch b: branchs) {
				System.out.println("**********BRANCH DETAILS******");
				System.out.println(b.getId());
				System.out.println(b.getLocation());
				System.out.println(b.getCity());
				System.out.println(b.getPhoneno());
				
			}
		}
	}
}
