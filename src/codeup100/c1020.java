import java.util.Scanner;

public class c1020 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Scanner 객체 생성
		System.out.print("주민번호 입력 : ");
		String num = scan.nextLine(); // 한 줄을 입력받음
		String[] arr = num.split("-");

        for(String a : arr){
            System.out.print(a);
        }
		//System.out.printf(arr[0]+arr[1]); 
		scan.close(); // 입력 종료후 스캐너 닫아주기
	}
}

// 입력 클래스인 Scanner 객체 생성
// 123456-1234567 형식으로 '-' 구분되어 입력된다.
// split() 메소드를 통해 '-'을 구분하여 String[], 문자열 배열에 각각 저장 
// EnhancedLoop for문을 이용하여 arr의 값을 a에 하나씩 저장하고 a를 출력한다.
// -> arr에 값이 없을 때까지 for문이 반복된다.
// -> 배열에 저장되어있는 데이터 타입과 데이터를 받을 변수의 타입이 같아야한다.
// Scanner 객체를 이용한 입력이 종료되었으므로 객체 닫기