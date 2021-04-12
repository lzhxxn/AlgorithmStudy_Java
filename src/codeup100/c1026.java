import java.util.Scanner;

public class c1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시분초 입력: ");

        String date = sc.nextLine();
        sc.close();

        String[] arr = date.split(":"); // ':'를 기준으로 분할하여 배열에 저장

        for (int i = 0; i < arr.length; i++){
            String a = arr[i];
            if (i == 1){ // 입력된 데이터 중 '분'만 출력
                System.out.println(a);
            }
        }
        /*String clock = sc.nextLine();
        String arr[] = clock.split(":");
        int arr2[] = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            arr2[i] = Integer.parseInt(arr[i]);
        }

        System.out.printf("%02d", arr2[1]);*/
    }
}// end c1025

// 입력 클래스인 Scanner 객체 생성
// 입력 형식에 맞춰 시간을 입력받음
// 입력 종료되었으므로 sc 객체 닫기
// ':'를 기준으로 분할하여 배열에 저장
// for문을 이용하면서 if문으로 조건을 설정하여 '분'만 출력
// - i가 0, arr[0]은 '시'
// - i가 1, arr[1]은 '분'
// - i가 2, arr[2]은 '초', for문 종료
