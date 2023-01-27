package Step4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj4344 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int C = Integer.parseInt(br.readLine()); // 테스트케이스
        String Narr[] = new String[C];
        // int N = Integer.parseInt(br.readLine()); //학생수

        StringTokenizer st;

        for (int i = 0; i < C; i++) {
            Narr[i] = br.readLine();
            Double sum = 0.0;
            Double avg = 0.0;

            st = new StringTokenizer(Narr[i], " ");// 쪼개기
            Double Student = Double.parseDouble(st.nextToken()); // 처음 출력 되는 학생 수

            for (int j = 0; j < Student; j++) { // 학생 수 만큼 돌림
                sum = sum + Double.parseDouble(st.nextToken());
                avg = sum / Student;
            }

            System.out.println(Math.round(avg * 1000) / 1000.0); // 평균까지 구함 다시!!!
        }
    }
}
