import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = a / 4;
        StringBuilder sb = new StringBuilder("long");

        for (int i = 1; i < b; i++) {
            sb.append(" long");
        }
        sb.append(" int");

        System.out.println(sb.toString());

        sc.close();
    }
}