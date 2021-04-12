import java.util.Scanner;

public class c1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("다섯자리 정수 입력: ");

        int num = sc.nextInt();
        sc.close();

        int first = (num / 10000) * 10000;
        int second = (num - first) / 1000 * 1000;
        int third = (num - first - second) / 100 * 100;
        int fourth = (num - first - second - third) / 10 * 10;
        int fifth = (num - first - second - third - fourth);

        System.out.println("[" + first + "]");
        System.out.println("[" + second + "]");
        System.out.println("[" + third + "]");
        System.out.println("[" + fourth + "]");
        System.out.println("[" + fifth + "]");
    }
}// end c1025

// 입력 클래스인 Scanner 객체 생성
// 단어 입력받음
// 입력 종료되었으므로 sc 객체 닫기
// 입력 단어의 길이에 맞춰 문자배열 생성 (Boy 길이는 '3', 문자배열도 3칸 생성)
// for문을 통해 문자열의 문자 하나씩을 문자배열에 저장
// - i가 0, 'B'를 arr[0]에 저장..
// EnhancedLoop를 이용하여 arr의 값들을 출력