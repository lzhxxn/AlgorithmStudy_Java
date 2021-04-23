package codeup;

import java.util.Scanner;
import java.math.BigDecimal;

public class c1030 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BigDecimal bigDecimal = sc.nextBigDecimal();
		sc.close();
		
		System.out.println(bigDecimal);
	}
}

// %f 실수(float)
// %d 정수(integer)
// %s 문자열(String)
