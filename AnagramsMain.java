package week1.day7.assignment4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class AnagramsMain {

	public static void main(String[] args) {
		HashMap<String,HashSet<String>> sets = new HashMap<String, HashSet<String>>();
		
		String input = "listen pot part opt trap silent top this hello hits what";
		
		Scanner in = new Scanner (input);
		
		while (in.hasNext()) {
			String word = in.next();
			StringBuilder sortedWord = new StringBuilder (word);
			StringSorter.sortChars(sortedWord);
			
			if (sets.containsKey(sortedWord.toString())) {
				sets.get(sortedWord.toString()).add(word);
			}
			else {
				HashSet<String> newSet = new HashSet<String> ();
				newSet.add(word);
				sets.put(sortedWord.toString(), newSet);
			}
		}
		
		for (String s : sets.keySet()) {
			HashSet<String>theSet = sets.get(s);
			if (theSet.size() > 1)
				System.out.println(theSet);
		}
		in.close();
	}
}
