package set;

import java.util.ArrayList;
import java.util.Iterator;

public class TestClass03 {
	public static void main(String[] args) {
		/*
			Iterato - 반복자
			- 컬렉션 프레임워크들을 선수있는 배열형식으로 변환해 준다.			
		*/
		ArrayList<String> arr = new ArrayList<>();
		arr.add("일"); arr.add("이"); arr.add("삼");
		System.out.println("arr : "+arr);
		
		Iterator<String> it = arr.iterator();
		/*
			hasNext : 다음 위치의 값이 있으면 true, 없으면 false
			next : 다음 위치로 이동하며 해당 위치의 값을 얻어오는 기능
		*/
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		System.out.println(it.next());
	}
}