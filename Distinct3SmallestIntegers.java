package Streams;

import java.util.stream.IntStream;

public class Distinct3SmallestIntegers {

	public static void main(String[] args) {
		int[] numbers = {1,5,4,3,2,1,7,18};
		
		IntStream.of(numbers).distinct().sorted().limit(3).forEach(System.out::println);

	}

}
