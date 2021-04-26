package codeup;

import java.util.Scanner;

public class c1040 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("정수 입력: ");
    int num = sc.nextInt();
    
    if( num < -2147483647 || num > 2147483647 ) {
      System.out.print("범위 안의 정수를 입력해주세여");
    } else {
      System.out.print(-num);
    }
  }
}
