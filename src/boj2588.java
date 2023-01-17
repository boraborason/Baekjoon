import java.util.Scanner;

public class boj2588 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // 첫번 째 자연수
        int B = sc.nextInt(); // 두번 째 자연수

        int cal_1 = A * (B % 10); // 일의 자리
        int cal_2 = A * (B % 100 / 10); // 나머지로 3의 자리 탈락->나눠서 몫으로 출력
        int cal_3 = A * (B / 100); // 몫으로 3의 자리 출력

        System.out.println(cal_1);
        System.out.println(cal_2);
        System.out.println(cal_3);

        int cal_4 = cal_1 + (cal_2 * 10) + (cal_3 * 100);
        System.out.println(cal_4);

        sc.close();
    }
}
