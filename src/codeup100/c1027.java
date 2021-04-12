import java.util.Scanner;

public class c1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연월일 입력: ");
        String date = sc.nextLine();
        sc.close();

        String[] arr = date.split("\\.");
        int[] arr2 = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            arr2[i] = Integer.parseInt(arr[i]);
        }
        
        System.out.printf("%02d-%02d-%04d", arr2[2], arr2[1], arr2[0]);
    }
}

// 입력 클래스인 Scanner 객체 생성
// '.'으로 구분하여 연월일 입력
// arr의 길이에 맞춰 int형 배열 선언(arr2)
// arr2에 arr의 데이터들을 int형으로 변환하여 저장
// 출력
