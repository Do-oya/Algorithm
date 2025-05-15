import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] c = new int[a];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < c.length; i++) {
            c[i] = Integer.parseInt(st.nextToken());
        }

        for (int j : c) {
            if (j < b) {
                bw.write(j + " ");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}