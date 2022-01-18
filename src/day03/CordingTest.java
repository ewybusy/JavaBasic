// 비트캠프 자바 기초코딩반
// 엄우용


package day03;


import java.util.Scanner;
public class CordingTest {
	public static void main(String[] args) {
		int number1;
		int number2;
		int number3;

		Scanner	scanner = new Scanner(System.in);

		System.out.print("첫번째 숫자를 입력하여주세요 : ");
		number1 = scanner.nextInt();

		System.out.print("두번째 숫자를 입력하여주세요 : ");
		number2 = scanner.nextInt();
		
		System.out.print("세번째 숫자를 입력하여주세요 : ");
		number3 = scanner.nextInt();
		
		System.out.println("사용자가 입력한 숫자 ");
		System.out.println();
		
		int sum;
		int sum1;
		
		sum = number1 + number2 + number3;
		sum1 = number1 * number2 * number3;
		
		System.out.println("세 숫자의 합");
		System.out.println(sum);
		
		System.out.println("세 숫자의 곱 : ");
		System.out.println(sum1);
		

	}

	
}

