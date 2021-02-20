package javaTrickyQuestions;

import java.util.ArrayList;

public class FibonacciQuestion {
	
	public static void main(String[] args) {
		// to find fibonacci number in java using ArrayList.
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		nums.add(0);
		nums.add(1);
		
		for(int count = 0; count < 10; count++) {
			nums.add(nums.get(nums.size() -1) + nums.get(nums.size() -2));
		}   // 0 1 add((1 index before the end) + (2 index before the end))
		System.out.println(nums);
		
	}

}
