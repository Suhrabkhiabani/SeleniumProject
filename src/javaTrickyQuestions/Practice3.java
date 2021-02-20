package javaTrickyQuestions;
import java.util.HashMap;
public class Practice3 {
	
	public static void countwords(String str) {
		String[] allwords = str.split(" ");
		
		HashMap<String, Integer> words = new HashMap<String, Integer>();
		
		for(String i: allwords) {
			if(words.containsKey(i)) {
				words.put(i, words.get(i) +1);
			} else {
				words.put(i, 1);
			}
		}
		System.out.print(words);
	}
	public static void main(String[] args) {
		// how to find number of words in below sentence. 
		
		String text = "United States of Americ is on of the powerfull country in the world.";
		
		
		countwords(text);
		
	}
}

	