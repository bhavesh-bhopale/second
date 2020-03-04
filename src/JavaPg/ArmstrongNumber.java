package JavaPg;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int i=1,n=0,sum,number,temp;;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		number=sc.nextInt();
		sum=0;
		i=number;
				
while(number>0)
{
	n=number%10;
	number=number/10;
	sum=sum+(n*n*n);
	
}
if (sum==i)
{
	System.out.println(i+"is Armstrong Number");
}
else
{
	System.out.println(i+"is not ArmStrong number");
}
	}

}
