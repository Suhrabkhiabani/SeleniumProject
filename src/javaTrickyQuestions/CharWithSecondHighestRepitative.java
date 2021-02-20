package javaTrickyQuestions;
import java.util.*;
public class CharWithSecondHighestRepitative {
	public static void main(String[] args) {
		String text = "this is just to check if we can code it nor not i";
	// What is the character that has the second highest number of repetition in
			// this string :D?
			Map<Character, Integer> allChars = new HashMap<Character, Integer>();
			for (char c : text.toCharArray()) {
				if (allChars.containsKey(c)) {
					// increment the count for that char
					allChars.put(c, allChars.get(c) + 1);
				} else {
					// add the char to the map
					allChars.put(c, 1);
				}
			}
			System.out.println(allChars);
			
			int max = Integer.MIN_VALUE;
			int secondMax = Integer.MIN_VALUE;
			
			for (int num : allChars.values()) {
				if (num > max) {
					max = num;
				}
				if (num > secondMax && num < max) {
					secondMax = num;
				}
			}
			
			for (char c : allChars.keySet()) {
				if (allChars.get(c) == secondMax) {
					System.out.println("The character that has the highest repetition in the string is '" + c
							+ "' and it has " + secondMax + " number of repetitions");
				}
			}
		}
	}
