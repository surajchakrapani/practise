package interviewQuestions;

public class SingletonExample {

	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		
	}
}
	
	class Singleton{
		
		static Singleton obj = new  Singleton();
		
		private Singleton(){
			
		}
		
		public static Singleton getInstance() {
			return obj;
		}
	}


