import java.util.Scanner;

public class c1018_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Scanner 객체 생성
		//System.print("시간 입력 : ");
		String clock = scan.nextLine(); // 한 줄을 입력받음
		String[] arr = clock.split(":"); // ":"을 기준으로 문자열을 구분
		System.out.printf("%s:%s", arr[0], arr[1]); // 분할 문자열을 출력
		scan.close(); // 입력 종료후 스캐너 닫아주기
	}
}

// 시간 입력이 hh:mm 의 형식으로 입력
// split() 메소드를 통해 ':'을 구분하여 arr[0]에는 시, arr[1]에는 분이 저장됨
// 객체 다 사용하면 닫아주기