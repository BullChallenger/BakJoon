import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class BJ_1157 {

    public static void BJ_1157Test (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int arr[] = new int[26];
        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            if ('A' <= s.charAt(i) && 'Z' >= s.charAt(i)) {
                arr[s.charAt(i) - 'A']++;
            }

            else {
                arr[s.charAt(i) - 'a']++;
            }
        }

        int max = -1;
        char ch = '!';

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char)(i + 65);
            }

            else if (arr[i] == max) {
                ch = '?';
            }
        }
        bw.write(ch);
        bw.flush();
        bw.close();
    }
}
