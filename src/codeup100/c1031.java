package codeup;

import java.util.Scanner;

public class c1031 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("8진수로 변환할 10진수 입력 : ");
		int num = sc.nextInt();
		sc.close();
		
		System.out.printf("%o", num);
	}
}


// printf() 함수의 f는 formatted의 약자
