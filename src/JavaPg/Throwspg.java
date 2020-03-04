package JavaPg;

import java.io.IOException;

public class Throwspg {
		void m()throws IOException {
			throw new IOException("device error");
		}
		void n()throws IOException{
			m();
		}
		void p() {
		try {
			n();
		}catch(Exception e) {
			System.out.println("Exception handle");}
		}

		public static void main(String[] args) {
			Throwspg obj=new Throwspg();
			obj.p();
			System.out.println("normal flow");
			
		}
			
		}



			
			
		
	

