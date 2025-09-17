package collection;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		
		Map<String, String> Delagates = new HashMap<>();
		
		Delagates.put("CEO", "Camilla");
		Delagates.put("COO", "Ivy");
		Delagates.put("CFO", "Jame");
		Delagates.put("CHO", "Ivy");
		
		System.out.println(Delagates);
		
		Delagates.remove("CHO");
		System.out.println(Delagates);
		
		Delagates.put("CEO", "Arnel");
		System.out.println(Delagates);
		
		System.out.println("Print all roles");
		System.out.println(Delagates.keySet());
		
		for(String key: Delagates.keySet()) {
			System.out.println(key);
			System.out.println(Delagates.get(key));
		}
	}
}
