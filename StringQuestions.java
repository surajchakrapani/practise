package interviewQuestions;

public class StringQuestions {

	public static void main(String[] args) {
		
		printRegularChars("qwerty 12345 !@#$% ^&**(");
		swap2Strings("Suraj", "Sona");

	}

	private static void printRegularChars(String string) {
		String output = string.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(output);

	}
	private static void swap2Strings(String a,String b) {
	a = a + b;
	b = a.substring(0,a.length()-b.length());
	a = a.substring(b.length());

	System.out.println("a = " + a);
	System.out.println("b = " + b);
	}

	//MemoryLeak Problem till 1.6 , resolved in 1.7 for SubString internal working

}
