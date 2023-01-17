import java.util.Scanner;

public class boj3003 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int A[] = { 1, 1, 2, 2, 2, 8 };
        int B[] = new int[6];

        for (int i = 0; i < A.length; i++) {
            B[i] = sc.nextInt();
        }

        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i] - B[i]);
        }

        sc.close();
    }
}
