package javaTrickyQuestions;
import java.util.*;
public class PrintCountWordsCountCharInOneFunction {
	
	public static void countWords(String str) {
		//if we delete the space in below value or initialization it will print number of characters else number of words
		String[] words = str.split(" ");
		
		HashMap<String, Integer> data = new HashMap<String, Integer>();
		
		for(int i = 0; i<words.length; i++) {
			if(data.containsKey(words[i])) {
				data.put(words[i], data.get(words[i]) +1);
			} else {
				data.put(words[i], 1);
			}
		}
		System.out.println(data);
	}
	public static void main(String[] args) {
		String text = "the brown fox is very smart and can jump upto 10 meter high";
		countWords(text);
	}
}