package javaTrickyQuestions;

public class Q4ReverseString {
	
	public static void main(String[] args) {
		
		//reverse this String
			 String text = "this should be easy." ;
			
			 StringBuffer str = new StringBuffer(text);
			 System.out.println(str.reverse());
		System.out.println(reverseTheString(text));
	}
	
	public static String reverseTheString(String str) {
		String temp = "";
		
		for( int i = str.length()-1; i >= 0; i--) {
			temp += str.charAt(i);
		}
		return temp;
	}

}
