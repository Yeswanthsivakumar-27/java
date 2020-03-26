package strings;
import java.util.StringTokenizer;  

public class TokenizerEx {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("my name is yeswanth"," ");  
		StringTokenizer st1 = new StringTokenizer("my,name,is,yeswanth"," ");
		
	     while (st.hasMoreTokens()) {  
	         System.out.println(st.nextToken()); 
	        }  
	     System.out.println("Next token is : " + st1.nextToken(",")); 

	}

}
