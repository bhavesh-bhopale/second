package StringProgram;

public class Stringpg4 {
	public static void main(String[] args) {
//		String s="I Love My Indian";
//	String str[]=s.split("");
//		int len=s.length();
//		for (int i =len-1; i >=0; i--) {
//			System.out.print(str[i]);
//			
//		}
//
//		
//	}
//
//}
		 
//		//2nd program
		String s ="Hello I am bhavesh";
		String parts[]=s.split("");
		for (String part:parts) {	
		for (int i =part.length()-1;i>=0;i--) {
			System.out.print(part.charAt(i));
		}
		System.out.println(" ");
			
		}
	}
}