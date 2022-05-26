package interviewQuestions;

public class SeriesTypes {

	public static void main(String[] args) {
		fibonacciSeries(5);
	}

	//FibonacciSeries
	private static void fibonacciSeries(int n) {
		
		int a=0,b=1,c;
		System.out.print(a +","+b);
		for(int i= 0; i<n-1; i++) {
			c=a+b;
			a=b;
			b=c;
			
			System.out.print("," + c);
		}
	}
}
