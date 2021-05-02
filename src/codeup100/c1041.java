import java.util.Scanner;

public class c1041 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("영문자 입력: ");
        char c = sc.nextLine().charAt(0); // 문자하나입력
        c += 1; // 다음 문자를 저장
        System.out.println(c);

    }
}

// 1. 입력 클래스인 Scanner 객체 생성 (sc)
// 2. 문자 하나 입력 후 저장 (c)
// 3. c에 1을 더하여 다음 문자(아스키코드)로 바꾼 후 저장 
// 4. 출력
