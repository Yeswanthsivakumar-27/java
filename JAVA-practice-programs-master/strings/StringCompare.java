package strings;

public class StringCompare {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		String s4 = new String("Hello");
		String s3 = "Welcome";
		String s5 = "WELCOME";
		
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s4));
		
		System.out.println(s3.equals(s5));
		System.out.println(s3.equalsIgnoreCase(s5));
		
		System.out.println(s1==s2);   
		System.out.println(s1==s4); 
		System.out.println(s1.compareTo(s2)); 
		System.out.println(s1.compareTo(s3)); 
		System.out.println(s3.compareTo(s1)); 
		
	
		String s6 = "Sachin" + "Tendulkar";
		String s7 = s1.concat(s3);
		System.out.println(s6);
		System.out.println(s7);
		
		
		System.out.println(s1.substring(2));
		System.out.println(s5.substring(2,7));
	
	}

}
