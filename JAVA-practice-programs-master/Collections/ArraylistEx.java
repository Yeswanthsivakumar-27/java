package Collections;

import java.util.*;  
public class ArraylistEx
  {

	public static void main(String[] args) 
	{
		ArrayList<String> a =new ArrayList<String>();
		a.add("tamil");        
		a.add("yeswanth");  
		a.add("kumar");  
		a.add("raj");  
		
		//Traversing list through Iterator
		
		Iterator itr=a.iterator();  
		while(itr.hasNext())
		{  
		System.out.println(itr.next());  
		}  

	}

}
