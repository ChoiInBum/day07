package string;

import java.util.Scanner;

public class TestClass03 {
	public static void main(String[] args) {
		String str = "test";
		
		System.out.println("문자열 입력");
		String str2 = "	test	"; //new Scanner(System.in).nextLine();
		
		System.out.println(str+"."); 
		System.out.println(str2+".");
		System.out.println(str2.trim()+".");
		
		System.out.println("str == str2 : "+str.equals(str2));
		System.out.println("str == str2 : "+str.equals(str2.trim()));
		
		String addr = "052154/서울/종로구/단성사4층";
		String[] s_addr = addr.split("/");
		
		for(int i=0; i<s_addr.length; i++) {
			System.out.println(s_addr[i]);
		}
		
		//for(String ss : s_addr) {}
		
		String result = addr.replace("/", " ");
		System.out.println(addr);
		System.out.println(result);
		
		result = "010-1234-1234";
		System.out.println(result.replace("-", ""));
		
	}
}