import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dice = new int[3];

        for (int i = 0; i < 3; i++) {
            dice[i] = sc.nextInt();
        }

        if (dice[0] == dice[1] && dice[1] == dice[2]) {
            System.out.println(10000 + dice[0] * 1000);
        } else if (dice[0] == dice[1] || dice[1] == dice[2] || dice[0] == dice[2]) {
            int sameNumber = (dice[0] == dice[1]) ? dice[0] : dice[2];
            System.out.println(1000 + sameNumber * 100);
        } else {
            int maxNumber = Math.max(dice[0], Math.max(dice[1], dice[2]));
            System.out.println(maxNumber * 100);
        }
    }
}