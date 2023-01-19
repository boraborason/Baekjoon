package Step3;

import java.util.Scanner;

public class boj2439 {
  public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    sc.close();

    for (int i = 1; i <= A; i++) {
      for (int j = 1; j <= A - i; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

}
