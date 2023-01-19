package Step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj10951 {
  public static void main(String[] args) throws IOException {

    // EOF 입력에서 더이상 읽을 수 있는 데이터가 존재하지 않을 때 반복문 종료
    // Scanner 의 메소드인 hasNext() 를 통해 처리

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;

    while (true) {
      try {
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        sb.append(a + b).append("\n");
      } catch (Exception e) {
        break;
      }
    }
    System.out.print(sb);
  }
}
