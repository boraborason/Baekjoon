package Step4;

import java.util.Scanner;

public class boj10807 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 주어진 숫자 갯수
        int count = 0;
        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {

            arr[i] = sc.nextInt();
        }

        int a = sc.nextInt(); // 찾을 숫자

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == a) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
