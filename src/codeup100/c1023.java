import java.util.Scanner;

public class c1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("실수 입력: ");

        Double dNum = sc.nextDouble();
        sc.close();

        String[] arr = String.valueOf(dNum).split("\\.");

        for(String a : arr){
            System.out.println(a);
        }
    } // end c1023()
}

// 입력 클래스인 Scanner 객체 생성
// 실수를 입력받아 변수 dNum에 저장
// 입력 종료되었으므로 객체 닫기
// dNum을 String 형태로 변환하고 '.'을 기준으로 분할하여 String[]에 값을 저장한다.
// - arr[0] : 1, arr[1] : 414213 의 값이 저장됨
// EnhancedLoop를 이용하여 arr의 값들을 출력