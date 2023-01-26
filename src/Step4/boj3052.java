package Step4;

import java.util.Scanner;

public class boj3052 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int Narr[] = new int[10];
        int count = 0;
        int result = 0;

        for (int i = 0; i < Narr.length; i++) { // 받자마자 바로 나눔
            Narr[i] = sc.nextInt() % 42;
        }

        for (int i = 0; i < Narr.length; i++) {// 나머지 값 중복 확인
            for (int j = i + 1; j < Narr.length; j++) {
                if (Narr[i] == Narr[j]) {
                    count++;
                }
            }
            if (count == 0) { // 중복 아닌 숫자 카운트
                result++;
            }
        }
        System.out.println(result);
        sc.close();
    }
}
