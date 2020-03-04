package JavaPg;

public class ArrayCloning {
	public static void main(String[] args) {
		int arr[]= {33,12,8,9};
		System.out.println("printing original array");
		for(int i:arr) 
			System.out.println(i);
			
			System.out.println("printing the cloning array");
			int carr[]=arr.clone();
			for(int i:carr) 
				System.out.println(i);
			System.out.println("are both of equal");
			System.out.println(arr==carr);
			}
		}
		
	


