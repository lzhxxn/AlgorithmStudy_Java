package codeup;

import java.util.Scanner;
//import java.math.BigDecimal;

public class c1029 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("실수 입력: ");
		//BigDecimal bigDecimal = sc.nextBigDecimal();
		double num = sc.nextDouble();
		sc.close();
		
		//1. printf의 출력문으로 출력 형식에 맞춤
		//System.out.printf("%.11f", num);
		
		//2. String.format()의 메소드를 이용하여 출력 형식에 맞춤
		//String.format() 메소드를 사용하면 C 언어의 printf 함수처럼 서식 문자열을 사용한 " 형식 문자열 " 을 만들 수 있다
		System.out.println(String.format("%.11f", num));
		
		//System.out.println(bigDecimal);
	}
}

//BigDecimal은 Java언어에서 숫자를 정밀하게 저장하고 표현할 수 있는 유일한 방법이다. Double은 정밀도가 떨어진다.
//돈과 소수점을 다룬다면 BigDecimal은 필수이지만 단점은 느리다.
//String.format("출력형식", 매개변수)를 이용하여 형식을 바꾸어 출력한다.
