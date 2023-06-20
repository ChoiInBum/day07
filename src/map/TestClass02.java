package map;

import java.util.HashMap;

public class TestClass02 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("num", 100);
		map.put("age", 20);
		System.out.println("map : "+map);
		
		int num = map.get("age");
		System.out.println("num : "+num);
		System.out.println("map.get(num) : "+map.get("num"));
		
		System.out.println(map.containsKey("age"));
		System.out.println(map.containsValue(100));
		
		map.put("age", 100); //key 중복 안됨
		System.out.println("map : "+map);
		
		map.remove("age");
		System.out.println("remove : "+map);
	}
}