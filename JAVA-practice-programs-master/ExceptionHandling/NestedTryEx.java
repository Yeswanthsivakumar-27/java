package ExceptionHandling;

public class NestedTryEx {

	public static void main(String[] args) {
	 try {
		try {
			int a[]=new int[5];  
		    a[5]=4;
		    }
		catch(ArrayIndexOutOfBoundsException e)
		    {
			System.out.println("Array");
		    }
		
			try {
				int a = 50/0;
				}
			catch(NullPointerException e) 
			   {
				System.out.println("Null");
			   }
			 catch(ArithmeticException e) 
			  {
				System.out.println("Arithmetic");
			  } 
		}
	finally {
			System.out.println("Executed");
	}
		
		}

	
	}


