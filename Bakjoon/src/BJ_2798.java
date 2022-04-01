import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import static java.lang.System.exit;

public class BJ_2798 {

    public static void BJ_2798Test (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int sum = 0;
        int near = 0;
        int[] arr = new int[N];

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        blackjack(N, M, arr);
    }

    static void blackjack(int N, int M, int[] arr) {
        int sum = 0;
        int near = 0;

        for (int i = 0; i < N; i++) {
            sum += arr[i];
            for (int j = i + 1; j < N; j++) {
                sum += arr[j];
                for (int k = j + 1; k < N; k++) {
                    sum += arr[k];
                    if (sum == M) {
                        System.out.println(sum);
                        exit(0);
                    }
                    else if(M > sum && sum > near) {
                        near = sum;
                        sum -= arr[k];
                    }
                    else {
                        sum -= arr[k];
                    }
                }
                sum -= arr[j];
            }
            sum -= arr[i];
        }
        System.out.println(near);
    }

}
