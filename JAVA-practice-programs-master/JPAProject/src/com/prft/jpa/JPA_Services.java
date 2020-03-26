package com.prft.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.java.jpa.Student;

public class JPA_Services {
	public static void main(String args[]) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAProject");
	EntityManager em = emf.createEntityManager();
	em.getTransaction().begin();
	
	Student n= new Student();
	//n.setS_id(1);
	n.setS_name("saran");
	n.setS_department("CSE");
	
	Student m = new Student(); 
	m.setS_name("Yashu");
	m.setS_department("ECE");
	
	Student p = new Student(); 
	p.setS_name("Pri");
	p.setS_department("EEE");
		 	
    em.persist(n);
    em.persist(m);
    em.persist(p);
    em.getTransaction().commit();
    em.close();
    emf.close();	
	}
    
}
