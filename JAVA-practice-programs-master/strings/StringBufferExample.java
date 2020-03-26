package strings;

import java.lang.String;

public class StringBufferExample {

	public static void main(String[] args) {
		
		
		StringBuffer sb = new StringBuffer("Welcome");
		sb.append("Tendulkar");
		System.out.println(sb);
		
		
		StringBuffer sb1 = new StringBuffer("Welcome");
		sb1.insert(1,"Tendulkar");
		System.out.println(sb1);
		
		
		StringBuffer sb2 = new StringBuffer("Welcome");
		sb2.replace(1,3,"Tendulkar");
		System.out.println(sb2);
		

		StringBuffer sb3 = new StringBuffer("Welcome");
		sb3.delete(1,3);
		System.out.println(sb3);
		
		
		StringBuffer sb4 = new StringBuffer("Welcome");
		sb4.reverse();
		System.out.println(sb4);
		
		
		StringBuffer sb5 = new StringBuffer();
		sb5.append("Hellooooooooooooo");
		System.out.println(sb5.capacity());
		StringBuffer sb6 = new StringBuffer();
		sb6.append("Java");	
		System.out.println(sb6.capacity());
		}

}
