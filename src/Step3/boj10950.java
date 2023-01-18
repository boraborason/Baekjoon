package Step3;

import java.util.Scanner;

public class boj10950 {
  public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
    int length = sc.nextInt();

    for (int i = 0; i < length; i++) {

      int A = sc.nextInt();
      int B = sc.nextInt();

      System.out.println(A + B);
    }

    sc.close();
  }
}
