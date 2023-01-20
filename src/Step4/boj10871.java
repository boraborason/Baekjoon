package Step4;

import java.io.*;
import java.util.StringTokenizer;

public class boj10871 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());// 숫자갯수
        int x = Integer.parseInt(br.readLine());// 기준

        int[] a = new int[n]; // 숫자담을 배열선언

        st = new StringTokenizer(br.readLine(), " "); // 정수 n개 입력 공백이 디폴트?

        for (int i = 0; i < n; i++) {

            a[i] = Integer.parseInt(st.nextToken());// 하나씩 배열에 담는다.

            if (a[i] < x) {
                System.out.print(a[i]);
            }
        }
        br.close();
    }
}
