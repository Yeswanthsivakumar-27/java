package IO_Streams;

import java.io.*; 

public class BufferedOutputEx 
{

	public static void main(String[] args)
	{
		try
		{
		 FileOutputStream fout=new FileOutputStream ("D:\\Eclipse\\bufferout1.txt");    
	     BufferedOutputStream bout=new BufferedOutputStream(fout);    
	     String s="hello";    
	     byte b[]=s.getBytes();    
	     bout.write(b);    
	     bout.flush();    
	     bout.close();    
	     fout.close();    
	     System.out.println("success");  
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
