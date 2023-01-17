import java.util.Scanner;

public class boj1008 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println("A :" + A);
        System.out.println("B :" + B);

        double C = (double) A / (double) B;
        System.out.println("A * B : " + C);

        sc.close();
    }
}
