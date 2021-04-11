import java.util.Scanner;

public class c1019 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Scanner 객체 생성
		//System.print("연월 입력 : ");
		String clock = scan.nextLine(); // 한 줄을 입력받음
		String[] arr = clock.split("\\."); // split를 쓸 때 뭔가 작동을 안 하면 \\을 붙여 보는 방법 추천.

        int[] arr2 = new int[arr.length]; // 문자열의 길이만큼 정수 배열 선언

        for(int i= 0; i < arr.length; i++){
            arr2[i] = Integer.parseInt(arr[i]);
        }
		System.out.printf("%04d.%02d.%02d", arr2[0], arr2[1], arr2[2]); // 분할 문자열을 출력
		scan.close(); // 입력 종료후 스캐너 닫아주기
	}
}

// 입력 클래스인 Scanner 객체 생성
// 날짜 입력이 yyyy:mm:dd 형식으로 '.' 구분되어 입력된다.
// split() 메소드를 통해 '.'을 구분하여 String[], 문자열 배열에 각각 저장 (문자열의 길이 : 3)
// 나눠진 문자열의 길이에 맞춰 int[], 정수 배열 arr2 생성 (값이 아직 저장되지 않음)
// for문을 통해 arr의 길이(3)에 맞춰 반복하여 문자열을 정수형태로 parsing하여 arr2의 배열에 저장한다.
// -> i=0, arr[0]의 값이 parsing 후 arr2[0]에 저장
// -> i=1, arr[1]의 값이 parsing 후 arr2[1]에 저장 
// -> i=2, arr[2]의 값이 parsing 후 arr2[2]에 저장
// 반복문 종료
// Scanner 객체를 이용한 입력이 종료되었으므로 객체 닫기