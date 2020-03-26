package strings;

public class StartsWithEx {

	public static void main(String[] args) {
		String s1="java string split method";  
		System.out.println(s1.startsWith("ja"));  
		System.out.println(s1.startsWith("java string"));  
		System.out.println(s1.startsWith("a",1)); 
		System.out.println(s1.startsWith("a",2)); 
	}

}
