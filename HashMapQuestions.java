package interviewQuestions;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapQuestions {

	public static void main(String[] args) {
		
		findCountOfWords("I am learning");
		
		Integer[] array = {3,4,3,5,3,6};
		findOccurencesOnIntegers(array);
		
	}

	private static void findCountOfWords(String string) {
		
		HashMap <String,Integer> hm = new HashMap<>();
		String[] str =string.split(" ");
		for(String tempString: str) {
			//System.out.println(tempString);
			if(hm.containsKey(tempString)) {
				hm.put(tempString, hm.get(tempString)+1);
			}
			else {
				hm.put(tempString, 1);
			}
		}
		System.out.println(hm);
		Iterator <String> tempString = hm.keySet().iterator();
		while(tempString.hasNext()) {
			String temp = tempString.next();
			if(hm.get(temp) >1) {
				System.out.println(temp + " : " + hm.get(temp));
			}
		}
	}
	
	private static void findOccurencesOnIntegers(Integer[] arr) {
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(Integer tempInt: arr) {
			if(hm.get(tempInt) != null) {
				hm.put(tempInt, hm.get(tempInt)+1);
			}
			else {
			hm.put(tempInt, 1);
			}
		}
		System.out.println(hm);
	}
	

}
