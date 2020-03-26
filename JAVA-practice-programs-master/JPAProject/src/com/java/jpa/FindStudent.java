package com.java.jpa;

import javax.persistence.*;  

public class FindStudent {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPAProject");  
        EntityManager em=emf.createEntityManager();               
        
        Student s=em.find(Student.class,1);  
          
        System.out.println("Id = "+s.getS_id());  
        System.out.println("Name = "+s.getS_name());  
        System.out.println("Department = "+s.getS_department());  
	}

}