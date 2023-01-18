package Step2;

import java.util.Scanner;

public class boj2884 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        if (M - 45 < 0) {
            H--;
            M = M + 15;
            if (H < 0) {
                H = 24 - 1;
            }
            System.out.println(H + "시" + M + "분");
        } else {
            M = M - 45;
            System.out.println(H + "시" + M + "분");
        }

        sc.close();
    }
}
