package Step3;

import java.util.Scanner;

public class boj8393 {
  public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int aa = 0;

    for (int i = 1; i <= A; i++) {
      aa += i; // a = a + i
    }

    System.out.println(aa);
    sc.close();
  }
}
