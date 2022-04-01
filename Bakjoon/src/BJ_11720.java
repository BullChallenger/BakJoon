import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_11720 {

    public static void BJ_11720Test (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String num = br.readLine();
        int sum = 0;

        for(int i = 0; i < N; i++) {
            sum += Integer.parseInt(String.valueOf(num.charAt(i)));
        }

        System.out.println(sum);
    }

}
