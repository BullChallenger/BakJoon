import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ_2775 {
/* 재귀함수 사용
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        // a층에 살면 a - 1층
        // b호에 살면 1호부터 b호

        for (int i = 0; i < T; i++) {

            int a = Integer.parseInt(br.readLine()); // a >= 0
            int b = Integer.parseInt(br.readLine()); // b >= 1, 거주 인원은 = b

            System.out.println(aptPeople(a, b));
        }
    }

    public static int aptPeople(int a, int b) { // 재귀함수

        int count = 0;

        if (a == 0) {
            return b;
        }
        else {
            for (int j = 1; j <= b; j++) {
                count += aptPeople(a - 1, j);
            }
            return count;
        }
    }
 */
    public static int[][] APT = new int[15][15];

    public static void BJ_2775Test (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        apt();

        for (int i = 0; i < T; i++) {
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());

            sb.append(APT[a][b]).append('\n');
        }
        System.out.println(sb);
    }

    static void apt() {

        for(int i = 1; i < 15; i++) {

            APT[0][i] = i;
            APT[i][1] = 1;

        }

        for(int i = 1; i < 15; i++) {

            for(int j = 2; j < 15; j++) {

                APT[i][j] = APT[i][j - 1] + APT[i - 1][j];

            }
        }

    }

}
