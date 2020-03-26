package MultiThreading;

public class NamingThreadEx extends Thread {
	public void run(){
		   System.out.println("running...");
		  }
		 public static void main(String args[]){
			 NamingThreadEx t1=new NamingThreadEx();
			 NamingThreadEx t2=new NamingThreadEx();
			 NamingThreadEx t3=new NamingThreadEx();
		  System.out.println("Name of t1:"+t1.getName());
		  System.out.println("Name of t2:"+t2.getName());
		  System.out.println("Name of t3:"+t3.getName());
		  System.out.println("id of t1:"+t1.getId());
		  System.out.println("id of t2:"+t2.getId());
		  System.out.println("id of t3:"+t3.getId());

		  t1.start();
		  t2.start();
		  t3.start();

		  t1.setName("yeswanth sivakumar");
		  System.out.println("After changing name of t1:"+t1.getName());
		 }

}
