package string;

public class TestClass02 {
	public static void main(String[] args) {
		String str = "test";
		System.out.println(str);
		
		char ch = str.charAt(1);
		System.out.println(str.charAt(0));
		System.out.println(ch);
		
		System.out.println(ch == 'e');
	}
}