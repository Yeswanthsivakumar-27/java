package Collections;

import java.util.*;  

public class StackEx
{
	public static void main(String args[])
	{  
		Stack<String> s = new Stack<String>();  
		s.push("yeswanth");  
		s.push("raj");  
		s.push("tamil");  
		s.push("siva");  
		s.push("kumar");  
		s.pop();  
		Iterator<String> itr=s.iterator();  
		while(itr.hasNext())
		{  
		System.out.println(itr.next());  
		}  
		}  

}
