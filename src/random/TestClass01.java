package random;

import java.util.Random;

public class TestClass01 {
	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			System.out.println(Math.random());
		}
		
		System.out.println("==========");
		
		for(int i=0; i<5; i++) {
			double ran = Math.random() * 5;
			// 0.0000 ~ 0.9999
			// * 3
			// 0.000 ~ 2.999
			// (int)(0.000 ~ 2.999) => 0~2
			System.out.println((int)ran);
		}
		
		System.out.println("==========");
		Random r = new Random();
		for(int i=0; i<5; i++) {
			int num = r.nextInt(3); //0~2
			System.out.println(num+1);
		}
		
	}
}