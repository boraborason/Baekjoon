package Step3;

import java.util.Scanner;

public class boj1110 {

  public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in); // 다시

    // 입력받기
    int N = sc.nextInt();
    int temp = N;
    int count = 0;

    while (true) {
      int left = temp / 10;
      int right = temp % 10;
      temp = right * 10 + (left + right) % 10;
      count++;
      if (N == temp) {
        break;
      }
    }

    System.out.println(count);
    // 10보다 작다면 앞에 0 붙이기
    // 쪼개기
    // 더하기
    // 2번째 자리 숫자와 값의 1의 자리와 붙임 2 6 -> 60+8
    // 반복 (첫숫자와 같을 때까지)

  }

}
