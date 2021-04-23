package codeup;

import java.util.Scanner;

public class c1032 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("16진수로 변환할 10진수 입력 : ");
		int num = sc.nextInt();
		sc.close();
		
		System.out.printf("%x", num);
	}
}
