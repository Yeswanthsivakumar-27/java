package Collections;

import java.util.*;  
public class LinkedlistEx
{

	public static void main(String[] args) 
	{
		LinkedList<String> a=new LinkedList<String>();  
		a.add("yesh");       
		a.add("sivakumar");  
		a.add("tamil");  
		a.add("Yash");    
		Iterator<String> itr=a.iterator();  
		while(itr.hasNext())
		{  
		System.out.println(itr.next());  
		}  

	}

}
