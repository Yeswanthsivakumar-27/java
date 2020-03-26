package com.java.jpa;

import javax.persistence.*;  

@Entity
@Table(name="student")
 
public class Student {
	
	@Id
	@SequenceGenerator(name="students", initialValue=1, allocationSize=100)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator= "students")
	private int s_id;  
    private String s_name;  
    private String s_department;  
      
    public Student(int s_id, String s_name, String s_department) {  
        super();  
        this.s_id = s_id;  
        this.s_name = s_name;  
        this.s_department = s_department;  
    }
public Student() {
	super();
}
	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getS_department() {
		return s_department;
	}

	public void setS_department(String s_department) {
		this.s_department = s_department;
	}  
   
}
