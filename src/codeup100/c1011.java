import java.util.Scanner;
 
public class c1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Scanner 객체생성
		//System.out.println("문자 입력 : ");
        char a = sc.next().charAt(0); //사용자로부터 입력 받기
        System.out.println(a);//출력
		sc.close();//입력 종료 후 Scanner 닫기
    }
}