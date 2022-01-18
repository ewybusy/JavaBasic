package day03;
// 사용자로부터 0이상의 자연수를 입력받는 프로그램
// 만약 사용자가 자연수가 아닌 숫자를 입력하면
// 다시 입력을 받는다.

import java.util.Scanner;
public class Ex06While02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("0이상의 자연수: ");
		int number = scanner.nextInt();
		
		while(number < 0) {
			System.out.println("잘못 입력하셨습니다.");
			System.out.print("0 이상의 자연수: ");
			number = scanner.nextInt();
		}
		
		
		System.out.println("사용자가 입력한 자연수: " + number);
	}

}
