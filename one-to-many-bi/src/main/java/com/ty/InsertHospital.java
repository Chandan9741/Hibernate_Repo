package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertHospital{

	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		hospital.setName("MANIPAL");
		hospital.setWebsite("www.manipal.com");

		Branch branch1 = new Branch();
		branch1.setLocation("BANGALORE");
		branch1.setCity("Yeshwanthpur");
		branch1.setPhoneno(52655);

		Branch branch2 = new Branch();
		branch2.setLocation("CHENNAI");
		branch2.setCity("Selam");
		branch2.setPhoneno(52655);

		List<Branch> branchs = new ArrayList<Branch>();
		branchs.add(branch1);
		branchs.add(branch2);

		hospital.setBranchs(branchs);
		branch1.setHospital(hospital);
		branch2.setHospital(hospital);
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
	    entityTransaction.begin();
	    
	    entityManager.persist(hospital);
	    entityManager.persist(branch1);
	    entityManager.persist(branch2);
	    
	    entityTransaction.commit();
	}

}
