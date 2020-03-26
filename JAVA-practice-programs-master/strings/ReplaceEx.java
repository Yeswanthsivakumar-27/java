package strings;

public class ReplaceEx {

	public static void main(String[] args) {
		String s1 = "Java is a programming language";
		String replaceString=s1.replace('a','e');
		System.out.println(replaceString);
		String replaceString1=s1.replace( "is","was");
		System.out.println(replaceString1);
		
	}

}
