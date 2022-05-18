package Streams;

import java.util.stream.IntStream;

public class BasiscsOfStreams {

	public static void main(String[] args) {
		
		//find minimum in the array
		int[] numbers = {1,5,4,3,2};
		
		int min = IntStream.of(numbers).min().getAsInt();
		int max = IntStream.of(numbers).max().getAsInt();
		double average = IntStream.of(numbers).average().getAsDouble();
		int count = (int) IntStream.of(numbers).count();
		int sum = IntStream.of(numbers).sum();
		
		System.out.println(min);
		System.out.println(max);
		System.out.println(average);
		System.out.println(count);
		System.out.println(sum);

	}

}
