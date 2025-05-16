import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int[] b = new int[a];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        int max = b[0];
        for (int j : b) {
            if (j > max) {
                max = j;
            }
        }

        int min = b[0];
        for (int j : b) {
            if (j < min) {
                min = j;
            }
        }

        bw.write(min + " " + max);
        bw.flush();
        bw.close();
    }
}