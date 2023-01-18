package Step2;

import java.util.Scanner;

public class boj2525 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        int cookTime = sc.nextInt();

        H += cookTime / 60;
        M += cookTime;

        if (M >= 60) {
            H -= 24;
            M %= 60;

            System.out.println(H + "시" + M + "분");
        } else {
            M = M + cookTime;
            System.out.println(H + "시" + M + "분");
        }

        sc.close();
    }
}
