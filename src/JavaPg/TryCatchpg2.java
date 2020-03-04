package JavaPg;

public class TryCatchpg2 {
	public static void main(String[] args) {
		try {
			int data=50/0;
			System.out.println("rest of the data");
		}
		catch(ArithmeticException e) {
		
		System.out.println(e);
			
		}
	}
}


