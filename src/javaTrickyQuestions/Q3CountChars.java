package javaTrickyQuestions;
import java.util.*;
public class Q3CountChars {
	public static void main(String[] args) {
		
	// write a function to count the number of chars in this String.
	// then it should print the list of the words with the repetition number of each
	// one of them.
		
		// we can count number of characters in a sentence in two different ways. 
		// 1. by creating a static void method and printing in main method. 
		// 2. by creating and printing directly in main method. 
	
	String text = "The brwon fox jumped on the desk. The fox is looking at the window now. fox fox fox";
	
	charRep(text);
	}
	public static void charRep(String str) {
		
		HashMap<Character, Integer> chars = new HashMap<Character, Integer>();
		for(int i = 0; i < str.length(); i++) {
			if(chars.containsKey(str.charAt(i))) {
				chars.put(str.charAt(i), chars.get(str.charAt(i)) +1);
			}
			else { chars.put(str.charAt(i), 1);
		}
	}
		System.out.println(chars);
	}
	/*
	 * public static void main(String[] args) {
	 * 
	 * String text = "I go to school everyday."; char[] x = text.toCharArray();
	 * HashMap<Character, Integer> data = new HashMap<Character, Integer>();
	 * 
	 * for(char c: x) { if(data.containsKey(c)) { data.put(c, data.get(c) +1); }
	 * else { data.put(c, 1); } } System.out.println(data); }
	 */
}
