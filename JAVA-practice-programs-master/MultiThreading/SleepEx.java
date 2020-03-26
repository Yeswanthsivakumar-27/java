package MultiThreading;

class SleepEx extends Thread 
{
	 public void run()
	 {  
		  for(int i=1;i<10;i++)
		  {  
		    try
		    {
		    	Thread.sleep(500);
		    	}
		    catch(InterruptedException e)
		    {
		    	System.out.println(e);
		    	}  
		    System.out.println(i);  
		  }  
		 }  
		 public static void main(String args[]){  
		  SleepEx t1=new SleepEx();  
		  
		  t1.start();  
		  
		 }
	}
