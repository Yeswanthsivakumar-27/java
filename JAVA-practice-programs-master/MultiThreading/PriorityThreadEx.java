package MultiThreading;

public class PriorityThreadEx extends Thread {
	 public void run(){  
		   System.out.println("running thread name is:"+Thread.currentThread().getName());  
		   System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  
		  
		  }  
		 public static void main(String args[]){  
			 PriorityThreadEx m1=new PriorityThreadEx();  
			 PriorityThreadEx m2=new PriorityThreadEx(); 
			
		  m1.setPriority(Thread.MIN_PRIORITY);  
		  m2.setPriority(Thread.MAX_PRIORITY); 
		 
		  m1.start();  
		  m2.start();
		
		   
		 }  

}
