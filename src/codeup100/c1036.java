package codeup;

import java.util.Scanner;

public class c1036 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자 입력: ");
    
    char c = sc.nextLine().charAt(0); //문자 하나 입력
		sc.close();
		
		System.out.printf((int)c);
	}
}
