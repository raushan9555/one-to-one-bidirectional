package com.ty.bikechassis;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertBikeChassis {
	public static void main(String []args) {
		Bike b1=new Bike();
		b1.setName("Ducati");
		b1.setCost(12000);
		Chassis c1=new Chassis();
		c1.setType("Steel+CarbonFibre");
		c1.setType("Carbon-Fibre");
		c1.setType("CarbonSteel");
		
		b1.setChassis(c1);
		c1.setBike(b1);
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(b1);
		entityManager.persist(c1);
		entityTransaction.commit();
	}

}
