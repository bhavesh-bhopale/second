package JavaPg;

public class Additon2Matriks {
	public static void main(String[] args) {
		int a[][]={{2,3,5},{5,6,7}};
		int b[][]={{5,7,8},{1,2,4}};
		
		
		int c[][]=new int[2][3];
		for (int i = 0; i < 2; i++) {
			for (int j = 0;j< 3; j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.println(c[i][j]+" ");
			}
			System.out.println();
				
				
			}
			
		}
		
		
		
	}


