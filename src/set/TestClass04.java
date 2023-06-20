package set;

import java.util.HashSet;
import java.util.Iterator;

public class TestClass04 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("일"); set.add("이"); set.add("삼");
		System.out.println("set : "+set);
		
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		
	}
}