import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {
            String s = br.readLine();
            int b = Integer.parseInt(s.split(" ")[0]);
            int c = Integer.parseInt(s.split(" ")[1]);

            bw.write("Case #" + (i + 1) + ": " + b + " + " + c + " = " + (b + c) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}