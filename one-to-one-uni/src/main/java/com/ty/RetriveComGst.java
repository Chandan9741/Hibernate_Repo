package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RetriveComGst {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		GST gst=entityManager.find(GST.class, 1);
		if(gst!=null) {
			System.out.println("===========GST INFO===========");
			System.out.println("gst id: "+gst.getId());
			System.out.println("gst number:  "+gst.getNumber());
			System.out.println("gst status: "+gst.getStatus());
			System.out.println("******************************");
		}
		else {
			System.out.println("Id not found");
		}
		Company company=gst.getCompany();
		if(company!=null) {
			System.out.println("========COMPANY INFO==========");
			System.out.println("company id: "+company.getId());
			System.out.println("company name: "+company.getName());
			System.out.println("company address: "+company.getAddress());
		}
	}

}
