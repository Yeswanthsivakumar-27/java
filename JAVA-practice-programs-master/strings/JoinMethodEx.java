package strings;

public class JoinMethodEx {

	public static void main(String[] args) {
		String joinString1=String.join("-","welcome","to","Perficient");  
		System.out.println(joinString1); 
		String joinString2=String.join("welcome","to","javatpoint","-");  
		System.out.println(joinString2); 
		 String date = String.join("/","27","09","2019");    
	     System.out.println(date);    
	     String time = String.join(":", "21","22","22");  
	     System.out.println(time);  

	}

}
