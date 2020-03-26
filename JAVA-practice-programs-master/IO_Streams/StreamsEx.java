package IO_Streams;

import java.io.*;


class StreamsEx implements java.io.Serializable 
{ 
    public int a; 
    public String b; 
  
    
    public StreamsEx (int a, String b) 
    { 
        this.a = a; 
        this.b = b; 
    } 
  
} 
  
class Test 
{ 
    public static void main(String[] args) 
    {    
    	StreamsEx object = new StreamsEx(1, "Mobiles"); 
        String filename = "file.ser"; 
          
        
        try
        {    
            
            FileOutputStream file = new FileOutputStream(filename); 
            ObjectOutputStream out = new ObjectOutputStream(file); 
              
            
            out.writeObject(object); 
              
            out.close(); 
            file.close(); 
              
            System.out.println("Object has been serialized"); 
  
        } 
          
        catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
  
  
        StreamsEx object1 = null; 
  
         
        try
        {    
            
            FileInputStream file = new FileInputStream(filename); 
            ObjectInputStream in = new ObjectInputStream(file); 
              
            
            object1 = (StreamsEx)in.readObject(); 
              
            in.close(); 
            file.close(); 
              
            System.out.println("Object has been deserialized "); 
            System.out.println("a = " + object1.a); 
            System.out.println("b = " + object1.b); 
        } 
          
        catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
          
        catch(ClassNotFoundException ex) 
        { 
            System.out.println("ClassNotFoundException is caught"); 
        } 
  
    } 
} 