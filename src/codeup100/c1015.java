import java.util.Scanner;

public class c1015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Scanner 객체생성

        float a = sc.nextFloat(); //사용자로부터 입력 받기
        System.out.printf("%.2f", a);//입력받은 실수 출력
		sc.close();//입력 종료 후 Scanner 닫기
    }
}