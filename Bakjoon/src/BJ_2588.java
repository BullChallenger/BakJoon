import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ_2588 {
    public static void BJ_2588Test (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        br.close();

        StringBuilder sb = new StringBuilder();

        sb.append(a*(b%10));
        sb.append('\n');

        sb.append(a*((b%100)/10));
        sb.append('\n');

        sb.append(a*(b/100));
        sb.append('\n');

        sb.append(a*b);

        System.out.print(sb);
    }
}
