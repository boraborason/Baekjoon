package Step3;

import java.util.Scanner;

public class boj25304 {
  public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
    int price = sc.nextInt(); // 금액
    int A = sc.nextInt(); // 물건 갯수
    int sum1 = 0;
    int sum2 = 0;

    for (int i = 0; i < A; i++) {
      int aaa = sc.nextInt();// 금액(개별)
      int bbb = sc.nextInt();// 갯수(개별)

      sum1 = aaa * bbb;
      sum2 = sum2 + sum1;
    }

    if (price == sum2) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

    sc.close();
  }
}
