๐ก๐ก๐ก๐ก
import java.util.Scanner;

public class c1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("์๋ถ์ด ์๋ ฅ: ");

        String date = sc.nextLine();
        sc.close();

        String[] arr = date.split(":"); // ':'๋ฅผ ๊ธฐ์ค์ผ๋ก ๋ถํ ํ์ฌ ๋ฐฐ์ด์ ์ ์ฅ

        for (int i = 0; i < arr.length; i++){
            String a = arr[i];
            if (i == 1){ // ์๋ ฅ๋ ๋ฐ์ดํฐ ์ค '๋ถ'๋ง ์ถ๋ ฅ
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

// ์๋ ฅ ํด๋์ค์ธ Scanner ๊ฐ์ฒด ์์ฑ
// ์๋ ฅ ํ์์ ๋ง์ถฐ ์๊ฐ์ ์๋ ฅ๋ฐ์
// ์๋ ฅ ์ข๋ฃ๋์์ผ๋ฏ๋ก sc ๊ฐ์ฒด ๋ซ๊ธฐ
// ':'๋ฅผ ๊ธฐ์ค์ผ๋ก ๋ถํ ํ์ฌ ๋ฐฐ์ด์ ์ ์ฅ
// for๋ฌธ์ ์ด์ฉํ๋ฉด์ if๋ฌธ์ผ๋ก ์กฐ๊ฑด์ ์ค์ ํ์ฌ '๋ถ'๋ง ์ถ๋ ฅ
// - i๊ฐ 0, arr[0]์ '์'
// - i๊ฐ 1, arr[1]์ '๋ถ'
// - i๊ฐ 2, arr[2]์ '์ด', for๋ฌธ ์ข๋ฃ
