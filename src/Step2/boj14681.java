package Step2;

import java.util.Scanner;

public class boj14681 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (0 < A && 0 < B) {
            System.out.println("1");
        } else if (0 < A && 0 > B) {
            System.out.println("4");
        } else if (0 > A && 0 > B) {
            System.out.println("3");
        } else {
            System.out.println("2");
        }
        sc.close();
    }
}
