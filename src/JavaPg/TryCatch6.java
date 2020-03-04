package JavaPg;

public class TryCatch6 {
	public static void main(String[] args) {
		try {
			int arr[]= {3,4,6,7};
			System.out.println(arr[20]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("rest of the code");
		
	}
	}


