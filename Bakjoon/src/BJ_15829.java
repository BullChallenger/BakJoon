import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ_15829 {

    static final int r = 31;
    static final int M = 1234567891;

    public static void BJ_15829Test (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int l = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int ch;
        long hash = 0;

        for (int i = 0; i < l; i++) {
            ch = s.charAt(i) - 'a' + 1;
            hash += ch * hash(i);
        }

        System.out.println(hash % M);
    }

    public static long hash(int n) {
        return n == 0 ? 1 : r * hash(n - 1) % M;
    }

}
