package Step4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj8958 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int cnt = 0; // 초기화 겸 선언
            int sum = 0;
            for (byte value : br.readLine().getBytes()) { // getBytes() 메소드는 입력 문자열을 byte 단위의 배열로 반환시켜주는 메소드다.
                                                          // 그리고 '배열'로 반환을 하므로 for-each 문에서도 쓸 수 있다.
                if (value == 'O') {// O=79, X=88
                    cnt++;
                    // System.out.println(cnt);
                    sum += cnt;
                    // System.out.println(sum);
                } else {
                    cnt = 0;
                }
            }
            System.out.println(sum);
        }
    }
}
