package Step4;

import java.util.Scanner;

public class boj2562 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int N = 9;
        int Narr[] = new int[N];
        int count = 0;
        int max = 0;

        for (int i = 0; i < Narr.length; i++) {
            Narr[i] = sc.nextInt();
        }

        for (int i = 0; i < 9; i++) {
            if (Narr[i] > max) {
                max = Narr[i];
                count = i + 1;// i번째 +1
            }
        }

        System.out.println(max); // 최대
        System.out.println(count); // 몇번 째인지

        sc.close();
    }
}
