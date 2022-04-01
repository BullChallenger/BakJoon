import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ_2562 {

    public static void BJ_2562Test (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = -1;
        int cnt = -1;

        for (int i = 0; i < 9; i++) {
            int n = Integer.parseInt(br.readLine());

            if (n > max) {
                max = n;
                cnt = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(cnt);
    }

}
