package Step2;

import java.util.Scanner;

public class boj2480 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (A == B && A == C) {
            System.out.println(10000 + A * 1000);
        } else if (B == A || B == C) {
            System.out.println(1000 + B * 100);
        } else {
            System.out.println(Math.max(Math.max(A, B), C) * 100);
        }
        sc.close();
    }
}
