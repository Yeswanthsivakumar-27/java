package strings;

public class TrimEx { 

	public static void main(String[] args) {
		String s1="  hello string   ";  
		System.out.println(s1+"Welcome");
		System.out.println(s1.trim()+"Welcome");
		
		 String s2 ="  hello";  
	        System.out.println(s2.length());  
	        System.out.println(s2); 
	        String tr = s2.trim();  
	        System.out.println(tr.length());  
	        System.out.println(tr); 

	}

}
