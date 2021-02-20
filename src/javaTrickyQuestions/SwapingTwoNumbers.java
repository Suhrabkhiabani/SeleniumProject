package javaTrickyQuestions;

public class SwapingTwoNumbers {
	
	public static void main(String[] args) {
		
		int a = 10, b = 20;
		
		System.out.println("before swapping the values are " + a + "  " +  b);
		 
		// logic one - third variable 
		int t = a;
		a=b;
		b=t;
		
		System.out.println("after swaping the vlaues " + a + "   " +b);
		
		// logic two using sum and minus. 
		
		a=a+b; // a = 10+20 = 30
		b =a-b; // b = 30=20 = 10
		a = a-b; // a = 30-10 = 20
	}

}
