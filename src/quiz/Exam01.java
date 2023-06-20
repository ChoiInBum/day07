package quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exam01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Integer> map = new HashMap<>();
		String name;
		int num, price, i;
				
		while(true) {			
			System.out.println("1. 메뉴 등록");
			System.out.println("2. 메뉴별 가격 보기");
			System.out.println("3. 종 료");
			System.out.print(">>> ");
			num = sc.nextInt();
			
			if(num==1) {
				System.out.print("음식 >> ");
				name = sc.next();				
				
				if(map.containsKey(name)) {
					System.out.println("등록된 메뉴입니다.");
					continue;
				}
				
				System.out.print("가격 >> ");
				price = sc.nextInt();				
				
				map.put(name, price);
				System.out.println("등록되었습니다.");
			} else if(num==2) {
				Set<String> set = map.keySet();
				Iterator<String> it = set.iterator();
				
				i=1;
				
				while(it.hasNext()) {
					String key = it.next();
					System.out.println(i+". "+key+" : "+map.get(key));
					i++;
				}
			} else if(num==3) {
				
			}
			
		}
		
	}
}