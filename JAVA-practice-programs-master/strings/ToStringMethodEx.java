package strings;

public class ToStringMethodEx {
  
			 int rollno;  
			 String name;  
			 String city;  
			  
			 ToStringMethodEx (int rollno, String name, String city)
			 {  
			 this.rollno=rollno;  
			 this.name=name;  
			 this.city=city;  
			 }  
			 public String toString()
			 {     
				  return rollno+" "+name+" "+city;  
			 }
			 public static void main(String args[]){  
				 ToStringMethodEx s1=new ToStringMethodEx(101,"yeswanth","chennai");  
				 ToStringMethodEx s2=new ToStringMethodEx(102,"sivakumar","coimbatore");  
			     
			   System.out.println(s1);
			   System.out.println(s2);
	}

}
