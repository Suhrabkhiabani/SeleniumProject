package javaTrickyQuestions;

public class ToFindVowels {
	public static void main(String[] args) {
		//how many vowel characters do we hae in this String?
		
		String text = "this is just to check if we can code it or not";
		int vcount = 0;
		int ccount = 0;
		String temp = text.replaceAll("", "").toUpperCase();
		for(int i = 0; i <temp.length(); i++) {
			if ("AEIOU".contains(String.valueOf(temp.charAt(i)))) {
				vcount++;
			} else {
				ccount++;
			}
		}
		System.out.println("Vowel chars: " + vcount);
		System.out.println("Constant chars: " + ccount);
		}   
		}
