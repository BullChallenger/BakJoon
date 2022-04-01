import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class BJ_10871 {

    public static void BJ_10871Test (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int N = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());;
        int value;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            value = Integer.parseInt(st.nextToken());

            if (value < x) {
                sb.append(value).append(' ');
            }
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }

}

