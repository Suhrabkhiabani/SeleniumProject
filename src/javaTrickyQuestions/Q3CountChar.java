package javaTrickyQuestions;
import java.util.*;
public class Q3CountChar {
	
	public static void countChars(String str) {
		char[] chars = str.toCharArray();
		
		HashMap<Character, Integer> charsWithCount = new HashMap<Character, Integer>();
		
		for(char i: chars) {
			if( charsWithCount.containsKey(i)) {
				charsWithCount.put(i, charsWithCount.get(i) +1);
			} else {
				charsWithCount.put(i, 1);
			}
		}
		System.out.println(charsWithCount);
	}
	
	public static void main(String[] args) {
		
		// write a function to count the number of chars in this String.
		// then it should print the list of the words with the repetition number of each
		// one of them.
		
		String text = "The e e e brwon fox jumped on the desk. The fox is looking at the window now. fox fox fox";
		
		countChars(text);
		}

}
