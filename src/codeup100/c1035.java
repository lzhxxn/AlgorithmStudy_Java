package codeup;

import java.util.Scanner;

public class c1035 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("8진수로 변환할 16진수 입력: ");
		int num = sc.nextInt(16); // 8진수 정수 입력
		sc.close();
		
		System.out.printf("%o", num);
	}
}
