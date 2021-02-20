package javaTrickyQuestions;
public class Practice1 {
	public static void main(String[] args) {
		
		// find the largest number in this array
		// find the smallest number in this array
		// find the sum of all numbers in this array
		// find the average of all numbers in this array
	int[] numbers = { 1, 5, 8, 6, 9, 5, 4, 2, 5, 8, 2, 5, 2, 5, 41 };
	
	int max = numbers[0], min = numbers[0], sum = 0;
	
	for (int num : numbers) {
		if(num > max) {
			max = num;
		} else if (num < min) {
			min = num;
		}
		sum += num;
	}
	// average of numbers:
	double avg1 = (double)sum / numbers.length;
	System.out.println("Min :" + min + " Max :" + max + " "
			+ "sum is: " + sum + " Average is: " + (Math.round(avg1 *100.0) /100.0));
	}
	// round the avg number to 2 decimal points. 

		



	
}