package quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String []alpha = new String[16];		
		HashMap<String, Integer> map = new HashMap<>(); //알파벳, 갯수
		HashMap<String, String> group = new HashMap<>(); //알파벳, 국가
		Set<String> set = group.keySet();
		
		int num;
		String nat;
		
		System.out.println("월드컵 조추첨");
		
		while(true) {
			System.out.println("1. 국가 입력");
			System.out.println("2. 조편성 보기");
			System.out.println("3. 나가기");
			System.out.print(">> ");
			num = sc.nextInt();
			System.out.println();
			
			if(num==1) {
				System.out.print("국가명 >> ");
				nat = sc.next();			
				
				for(int i=0; i<alpha.length; i++) {
					char ran = (char)(Math.random() * 4 + 65);
					
					alpha[i] = ran+"";
					
					for(String key: alpha) {
						map.put(key, map.getOrDefault(key, 0) + 1);
						
						if(map.getOrDefault(key, 0)>4)
							break;
					}
					
					group.put(alpha[i], nat);
				}			
				
				System.out.println("입력 되었습니다.");
			} else if(num==2) {
				Iterator<String> it = set.iterator();
				
				while(it.hasNext()) {
					String key = it.next();
					System.out.println(key+" : "+group.get(key));
				}
			}
		}
	}
}