package codeup;

import java.util.Scanner;

public class c1034 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("10진수로 변환할 8진수 입력: "); // c1031번과 반대 !
		int num = sc.nextInt(8); // 8진수 정수 입력
		sc.close();
		
		System.out.printf("%d", num);
	}
}

// 1. 입력 클래스인 Scanner 객체 생성
// 2. 8진수 입력
// 		->nextInt(?) : ?이 공백이면 default로 10진수, 숫자를 넣으면 해당 숫자의 진법으로 연산
// 3. 입력 종료되었으므로 객체 닫기
// 4. 8진수를 10진수로 변환하여 출력(printf문 이용)
