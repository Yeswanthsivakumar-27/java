package strings;

public class Methods1 {

	public static void main(String[] args) {
		String s1="siva";  
		
		char ch=s1.charAt(4);
		System.out.println(ch);  
		
		s1 = s1.concat("kumar"); 
		System.out.println(s1);
		
		    String str1 = "Hello";  
	        String str2 = "Hi";  
	        String str3 = "Welcome";  
	        
	        
	        String str4 = str1.concat(str2);          
	        System.out.println(str4);  
	        
	         
	        String str5 = str1.concat(str2).concat(str3);  
	        System.out.println(str5);  
	        
	        
	        String name="what do you know about me";  
	        System.out.println(name.contains("do you know"));  
	        System.out.println(name.contains("hello"));  
	        
	        
	        System.out.println(name.endsWith("e"));  
	        System.out.println(s1.endsWith("point"));  
		}

	}


