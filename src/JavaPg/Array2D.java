package JavaPg;

public class Array2D {
	public static void main(String[] args) {
		int arr[][] = { { 2, 3, 4 }, { 4, 3, 2 }, { 4, 5, 5 } };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(arr[i] [j]+"");
			}
			System.out.println();
		}
	}
}
