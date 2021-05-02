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
                System.out.println("출력 값 : " + result);

                run = false; // while문 종료
            }
        }
    } catch (Exception e) {
        System.err.println("범위 밖의 정수를 입력하셨습니다.");
    }
    sc.close();
    }
}

// 1. sc 객체 생성
// 2. while문 제어를 위한 변수 run 선언
// 3. int 범위 초과시 예외처리를 위해 try-catch 
//  - 범위 밖의 정수값 입력시 Error가 발생하고 이를 처리하기 위해 catch를 실행
//  - Error가 발생한 지점부터 그 아래의 코드들은 실행되지 않는다.
// 4. while문 코드를 통해 범위 내의 1번째, 2번째 정수를 입력받고 2번째 정수가 0이 아니면
// 5. num1/num2의 결과값을 result에 저장한 후 출력
// 6. whlie 제어 변수인 run을 false로 저장한 후 while문 종료
// 7. sc 객체 닫기

// *이전 문제에서는 Error를 잡기 위해 if-else문을 사용하였다. if-else문에서는 Error가 발생하면 종료되었지만
// 이번에는 while문을 통해 범위 내에서 Error가 발생하면 다시 처음부터 반복 되는 코드를 작성하였다.
