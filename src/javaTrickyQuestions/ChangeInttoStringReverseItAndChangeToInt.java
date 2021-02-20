package javaTrickyQuestions;

public class ChangeInttoStringReverseItAndChangeToInt {

	
//	public static String reverseString(String str) {
//		String data = "";
//		for (int i = str.length() - 1; i >= 0; i--) {
//			data += str.charAt(i);
//		}
//		return data;
//	}
	public static void main(String[] args) {
		int num = 15948;
		String data = "";
		String s=String.valueOf(num);
			
			for (int i = s.length() - 1; i >= 0; i--) {
				data += s.charAt(i);
			}
			System.out.println(data);
			int y = Integer.parseInt(s);
			System.out.println(y);
		}
}
