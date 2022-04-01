import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2839 {

    public static void BJ_2839Test (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 3, 5

        if (N == 4 || N == 7) {
            System.out.println(-1);
        } else if ((N % 5) == 0) {
            System.out.println(N / 5);
        } else if ((N % 5) == 1 || (N % 5) == 3) {
            System.out.println((N / 5) + 1);
        } else if ((N % 5) == 4 || (N % 5) == 2) {
            System.out.println((N / 5) + 2);
        }
    }
}
