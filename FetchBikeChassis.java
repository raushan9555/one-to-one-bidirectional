package com.ty.bikechassis;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchBikeChassis {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
	
		
		
		Bike bike=entityManager.find(Bike.class,1);
		System.out.println(".....Bike-Info.......");
		System.out.println(bike.getId());
		System.out.println(bike.getName());
		System.out.println(bike.getCost());
		Chassis chassis=bike.getChassis();
		System.out.println(".....Chassis-Info.......");
		Chassis ch=bike.getChassis();
		System.out.println(ch.getId());
		System.out.println(ch.getType());

	}

}
