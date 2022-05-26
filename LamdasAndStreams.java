package interviewQuestions;

import java.util.Arrays;
import java.util.List;

public class LamdasAndStreams {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,12,3,4,7,11);
		List<String> words = Arrays.asList("hello","","hate","love","","","bye");
		
		int totalwords = (int) words.stream().filter(word-> word == "love").count();
		int sum = numbers.stream().filter(number -> number % 2 != 0).reduce(0, Integer::sum);
		
		System.out.println(sum);
		System.out.println(totalwords);
	}

}
