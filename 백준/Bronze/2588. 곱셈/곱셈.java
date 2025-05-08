import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 예제 입력 받기
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // (3), (4), (5), (6)에 들어갈 값 계산
        int result3 = num1 * (num2 % 10);
        int result4 = num1 * ((num2 / 10) % 10);
        int result5 = num1 * (num2 / 100);
        int result6 = num1 * num2;

        // 결과 출력
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
		
	}

}