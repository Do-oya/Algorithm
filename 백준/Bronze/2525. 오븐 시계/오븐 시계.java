import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int total = a * 60 + b + c;
        
        int endA = total / 60;
        int endB = total % 60;
        
        if (endA >= 24)
            endA -= 24;

        System.out.println(endA + " " + endB);
    }
}