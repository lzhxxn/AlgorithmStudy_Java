package codeup;

import java.util.Scanner;

public class c1038 {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextInt();
		double b = sc.nextInt();
		
		System.out.printf("%.0f", a+b);
	}
}

// 이렇게 접근했으나 너무 좋은 OpenSource를 발견해 적어본다 

💡💡
package codeup;

import java.util.Scanner;

public class c1038 {
	public static void main(String[] args){
		
	Scanner sc = new Scanner(System.in); // Scanner 객체 생성
	
	// 범위 : -1073741824 ~ 1073741824 
	System.out.print("첫번째 정수 입력: ");
	long num1 = sc.nextLong();
	long num2 = 0;
	
	if( num1 < -1073741824 || num1 > 1073741824 ) { // num1이 범위 밖 
		System.out.println("범위 안의 정수를 입력해주세요.");	
	
	}else{ // num1이 범위 내
		System.out.print("두번째 정수 입력: ");
		num2 = sc.nextLong();
		
		if( num2 < -1073741824 || num2 > 1073741824 ) { // num2이 범위 밖
			System.out.println("범위 안의 정수를 입력해주세요.");
			
		}else{
			sc.close();
			long sum = num1 + num2;
			System.out.println(sum);
		}
	  }
     }
}
		
	
