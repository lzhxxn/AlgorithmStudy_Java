import java.util.Scanner;

public class c1042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.printf("%d", a/b);
    } 
}


// 이렇게 접근했으나 너무 좋은 OpenSource를 발견해 적어본다 
💡💡💡💡💡💡💡

import java.util.Scanner;

public class c1042 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      boolean run = true; // while문을 제어하기 위한 변수
      
      // 범위 밖의 값을 입력했을 때를 위한 예외처리
      try {
       // ( int 범위 : -214783648 ~ 214783648 )
         while (run) { // 범위 내의 값 입력 
           System.out.println("첫 번째 정수 입력 : " );
           int num1 = sc.nextInt();
           
           System.out.println("두 번째 정수 입력 : " );
           int num2 = sc.nextInt();
           
           if ( num2 == 0 ) {
             System.out.println("나누는 수가 0이 될 수 없습니다.");
             // while문 반복
             
           } else { // num2 != 0
             int result = num1 / num2;
             System.out.println(result);
             run = false; // while문 종료
           }
         }
      } catch (Exception e) {
        System.err.println("범위 밖의 정수를 입력하셨습니다.");
      }
      sc.close();
    }
}
