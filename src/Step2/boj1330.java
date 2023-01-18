package Step2;

import java.util.Scanner;

public class boj1330 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A > B) {
            System.out.println(A + ">" + B);
        } else if (A < B) {
            System.out.println(A + "<" + B);
        } else {
            System.out.println(A + "==" + B);
        }
        sc.close();
    }
}
