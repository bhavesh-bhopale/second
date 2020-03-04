package collectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortPg {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Bhavesh");
		al.add("amit");
		al.add("rahul");
		al.add("sanu");
		
		Collections.sort(al);
		//Collections.reverse(al); 
		 Iterator itr=al.iterator();
		 while(itr.hasNext()){
		 System.out.println(itr.next());
		}
		
	}

}
