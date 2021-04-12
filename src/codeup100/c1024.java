import java.util.Scanner;

public class c1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("단어 입력: ");

        String word = sc.nextLine();
        sc.close();

        char[] arr = new char[word.length()]; //  문자배열 생성

        for(int i = 0; i < word.length(); i++){
            arr[i] = word.charAt(i); // 입력받은 단어를 문자 하나씩 배열에 저장
        } // end for1

        for(char a : arr){
            System.out.println("'" + a + "'"); // 출력형식에 맞춰 문자 출력
        } // end for2
    } // end main
}// end c1024

// 입력 클래스인 Scanner 객체 생성
// 단어 입력받음
// 입력 종료되었으므로 sc 객체 닫기
// 입력 단어의 길이에 맞춰 문자배열 생성 (Boy 길이는 '3', 문자배열도 3칸 생성)
// for문을 통해 문자열의 문자 하나씩을 문자배열에 저장
// - i가 0, 'B'를 arr[0]에 저장..
// EnhancedLoop를 이용하여 arr의 값들을 출력