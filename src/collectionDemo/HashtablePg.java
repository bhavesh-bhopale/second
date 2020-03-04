package collectionDemo;

import java.util.Hashtable;

public class HashtablePg {
	public static void main(String[] args) {
		Hashtable map = new Hashtable();
		map.put(101,"Bhavesh");
		map.put(103,"Amit");
		map.put(104,"Rahul");
		map.put(105,"Sanu");
		
		System.out.println(map.getOrDefault(101,"Not Found"));
		System.out.println(map.getOrDefault(107, "Not Found"));
	}

}
