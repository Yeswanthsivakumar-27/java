package com.java.jpa;

import javax.persistence.*;
@Entity
public class Student {
	
	    @Id  
	    @GeneratedValue(strategy=GenerationType.AUTO)  
	    private int s_id;  
	    private String s_name;  
	      
	    @ManyToOne(targetEntity=Library.class)
	    private Library lib;  
	      
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
	    public Library getLib() {  
	        return lib;  
	    }  
	    public void setLib(Library lib) {  
	        this.lib = lib;  
	    }  
}