package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestsaveCompany {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Company company=new Company();
		company.setName("INFOSYS");
		company.setAddress("CHENNAI");
		
		GST gst=new GST();
		gst.setNumber("ABD545");
		gst.setStatus("Pending");
		gst.setCompany(company);
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(company); 
		entityManager.persist(gst);
		entityTransaction.commit();
	}

}
