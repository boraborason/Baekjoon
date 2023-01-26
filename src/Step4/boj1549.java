package Step4;

import java.util.Arrays;
import java.util.Scanner;

public class boj1549 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        double Marr[] = new double[M];
        double max = 0;
        double total = 0;
        for (int i = 0; i < Marr.length; i++) {
            Marr[i] = sc.nextInt();
        }

        Arrays.sort(Marr);
        max = Marr[Marr.length - 1];

        for (int i = 0; i < Marr.length; i++) {
            Marr[i] = (Marr[i] / max) * 100;
            total += Marr[i];
        }
        System.out.println(total / (double) M);
        sc.close();
    }
}
