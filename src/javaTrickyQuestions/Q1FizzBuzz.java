package javaTrickyQuestions;
import java.util.*;
public class Q1FizzBuzz {
	
	public static void printfizzbuzz(int start, int end) {
		for(int num = start; num < end; num++) {
			if(num%5==0 && num%3==0) {
				System.out.println("fizzbuzz");
			} else if (num%5==0) {
				System.out.println("buzz");
			} else if (num%3==0) {
				System.out.println("fizz");
			} else {
				System.out.println(num);
			}
		}
	}
	
	public static void wordcount(String str) {
		String [] allWords = str.split(" ");
		
		HashMap<String, Integer> words  = new HashMap<String, Integer>();
		for(int i = 0; i <allWords.length; i++) {
			if(words.containsKey(allWords[i])) {
				words.put(allWords[i], (words.get(allWords[i]) +1));
			} else {
				words.put(allWords[i], 1);
			}
		}
		System.out.println(words);
	}
	
	
	public static void main(String[] args) {
		
		printfizzbuzz(1, 20);
		String text = "this is very interesting story in the united states of america";
		wordcount(text);
		
		String s = "notebook";
		
		StringBuilder reverse = new StringBuilder(s);
		
		System.out.println(reverse.reverse());
	}

}
