package map;

public class TestClass05 {
	public static void main(String[] args) {
		float f1 = (float)1.11;
		int num = 100;
		String sNum = num+"";
		System.out.println(sNum+100);
		System.out.println(num+100);
		//"100" 가능. "안녕" 변환안됨
		int n = Integer.parseInt(sNum); //숫자형식의 문자열만 가능하다.
		System.out.println(n+123);
	}
}