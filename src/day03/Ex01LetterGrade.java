package day03;
// 사용자로부터 점수를 입력받아서
// A, B, C, D, F가 출력되는 프로그램을 작성해보세요.

// 1. 입력 준비
// 2. 점수 입력
// 3. 결과 출력

import java.util.Scanner; // 입력창 출력하게 하려면 필수
public class Ex01LetterGrade {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 입력창 출력하게 하려면 필수(scanner)
		
		System.out.println("점수를 입력해주세요: "); // 입력창 출력
		int score = scanner.nextInt(); // 나이 입력창 출력시 필수(score,scanner)
		
		if( score >= 100) {
			System.out.println("A");
		} else if(score >= 90) {
			System.out.println("B");
		} else if(score >= 80) {
			System.out.println("C");
		} else if(score >= 70) {
			System.out.println("D");
		} else {
			System.out.println("F");			
		}
	}
}


