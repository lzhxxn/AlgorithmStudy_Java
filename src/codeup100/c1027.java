๐ก๐ก๐ก๐ก
import java.util.Scanner;

public class c1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("์ฐ์์ผ ์๋ ฅ: ");
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

// ์๋ ฅ ํด๋์ค์ธ Scanner ๊ฐ์ฒด ์์ฑ
// '.'์ผ๋ก ๊ตฌ๋ถํ์ฌ ์ฐ์์ผ ์๋ ฅ
// arr์ ๊ธธ์ด์ ๋ง์ถฐ intํ ๋ฐฐ์ด ์ ์ธ(arr2)
// arr2์ arr์ ๋ฐ์ดํฐ๋ค์ intํ์ผ๋ก ๋ณํํ์ฌ ์ ์ฅ
// ์ถ๋ ฅ
