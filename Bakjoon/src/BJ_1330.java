import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class BJ_1330 {
    public static void BJ_1330Test (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        if (A > B) {
            bw.write('>');
            bw.flush();
            bw.close();
        }

        else if (A < B) {
            bw.write('<');
            bw.flush();
            bw.close();
        }

        else if (A == B) {
            bw.write("==");
            bw.flush();
            bw.close();
        }
    }
}
