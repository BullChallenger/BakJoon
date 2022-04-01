import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ_1259 {

    public static void BJ_1259Test (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            int n = Integer.parseInt(br.readLine());

            if (n == 0) {
                break;
            }

            else {
                int cnt = 0;

                String s = Integer.toString(n);

                for (int i = 0; i < s.length()/2; i++) {
                    if (s.charAt(i) == s.charAt(s.length() - 1 - i)) {
                        cnt ++;
                    }
                }

                if (cnt == s.length()/2) {
                    System.out.println("yes");
                }

                else {
                    System.out.println("no");
                }
            }
        }
    }
}
