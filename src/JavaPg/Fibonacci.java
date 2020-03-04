package JavaPg;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int n=0,n1=1,result,number,count=0;;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		number=sc.nextInt();
for(int i=1;i<=number;i++)
{
	System.out.println(n);
	result=n+n1;
	n=n1;
	n1=result;
			
}
	}
}
