package Step4;

import java.util.Arrays;
import java.util.Scanner;

public class boj10818 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Narr[] = new int[N];
        int max = 0;
        int min = 0;

        for (int i = 0; i < N; i++) {
            Narr[i] = sc.nextInt();
        }

        Arrays.sort(Narr);
        max = Narr[Narr.length - 1];
        min = Narr[0];

        System.out.println(min + " " + max);

        sc.close();
    }
}
