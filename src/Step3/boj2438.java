package Step3;

import java.util.Scanner;

public class boj2438 {
  public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();

    for (int i = 1; i <= A; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    sc.close();
  }
}
