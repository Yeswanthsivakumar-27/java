package IO_Streams;

import java.io.FileOutputStream;  
public class FileOutputStreamEx
{

	public static void main(String[] args) 
	{
		try 
		   {    
	             FileOutputStream fout=new FileOutputStream ("D:\\Eclipse\\testout.txt");  
	             String s="hello";  
	             byte b[]=s.getBytes();  
	             fout.write(b);    
	             fout.close();    
	             System.out.println("success...");    
	            }
		   catch(Exception e)
		   {
			   System.out.println(e);
			   }    
	      

	}

}
