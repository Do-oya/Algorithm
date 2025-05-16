import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                answer.append((char) ('a' + ch - 'A'));
            } else {
                answer.append((char) ('A' + ch - 'a'));
            }
        }
        System.out.println(answer);
    }
}