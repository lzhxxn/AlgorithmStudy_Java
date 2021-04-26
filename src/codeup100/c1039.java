package codeup;

import java.util.Scanner;

public class c1039 {
	public static void main(String[] args){
		
	Scanner sc = new Scanner(System.in); // Scanner 객체 생성
	
	// 범위 : -2147483648 ~ -2147483648 
	System.out.print("첫번째 정수 입력: ");
	long num1 = sc.nextLong();
	long num2 = 0;
	
	if( num1 < -2147483648L || num1 > 2147483648L ) { // num1이 범위 밖 
		System.out.println("범위 안의 정수를 입력해주세요.");	
	
	}else{ // num1이 범위 내
		System.out.print("두번째 정수 입력: ");
		num2 = sc.nextLong();
		
		if( num2 < -2147483648L || num2 > 2147483648L ) { // num2이 범위 밖
			System.out.println("범위 안의 정수를 입력해주세요.");
			
		}else{
			sc.close();
			long sum = num1 + num2;
			System.out.println(sum);
		}
	 }
 }
}
