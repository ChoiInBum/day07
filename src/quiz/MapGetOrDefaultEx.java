package quiz;

import java.util.HashMap;

public class MapGetOrDefaultEx {
	public static void main(String arg[]) {
		String [] alphabet = { "A", "B", "C" ,"A"};
		HashMap<String, Integer> hm = new HashMap<>();
		
		for(String key : alphabet) 
			hm.put(key, hm.getOrDefault(key, 0) + 1);
		System.out.println("결과 : " + hm.getOrDefault("A", 0));
    	// 결과 : {A=2, B=1, C=1}
	}
}