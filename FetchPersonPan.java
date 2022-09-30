package com.ty.personpan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchPersonPan {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Person person=entityManager.find(Person.class,1);
		if(person!=null) {
		System.out.println("...............GST-Info.............");
		System.out.println("Company ID :"+person.getId());
		System.out.println("Company Name"+person.getName());
		System.out.println("Company Address"+person.getGender());
		}
		else {
			System.out.println("Person Id doesnot exist");
		}
		//
		//Pan pan=new Pan();
		Pan pan=person.getRef();
		//entityManager.find(Pan.class,1);
		if(pan!=null) {
			System.out.println("...........PanInfo.....");
		System.out.println("Pan Id"+pan.getId());
		System.out.println(	"Pan number"+pan.getNumber());
		System.out.println(	"Pan Type"+pan.getType());
			
		}

	}

}
