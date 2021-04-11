import java.io.*;

public class c1022 {
    public static void main(String[] args) throws Exception {
        // BufferedReader와 BufferedWriter를 사용하기 위해 예외처리 (throws Exception)

        // 입력 클래스인 BufferedReader 객체 생성 (br)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("한 문장 입력: ");
        String str = br.readLine(); // 한 문장입력

        // 출력 클래스인 BuffrerdWriter 객체 생성 (br)
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(str+"\n"); // 입력받은 str 값을 받는다
        bw.flush(); // 버퍼에 있는 값들 전부 출력
        bw.close(); // 출력 종료 후 BufferedWriter 닫기

    } // end c1022()
} // end c1022

// [Scanner] VS [BufferedReader] 차이점
// - 입력 데이터로 Scanner는 모든 데이터, BufferedReader는 String만 읽을 수 있다.
// - 버퍼의 크기, Scanner(1KB) > BufferedReader(8KB)
// - 처리 속도, Scanner < BufferdReader
// - Scanner 띄어쓰기는 Enter로 구분, BufferedReader Enter로만 구분
// 1. BufferedReader를 사용하기위해서는 try-catch 구문 또는 throws Exception을 써줘야 한다.
// 2. 입력 클래스 BufferedReader 객체 생성
// 3. 한 문장을 입력받음
// 4. 출력 클래스 BufferedWriter 객체 생성
// 5. bw에 write()메소드로 입력받은 str을 받아온다. ("\n" 사용한 이유는 BufferedReader는 개행기능 포함하지 않는다.)
// 6. 받아온 str을 flush() 메소드를 통해 전부 출력
// 7. BufferedWriter 객체를 이용한 출력이 종료되었으므로 객체 닫기