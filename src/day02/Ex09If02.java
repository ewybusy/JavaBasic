package day02;
// 1. int 변수 number를 만들고
//	  5를 저장하세요
// 문제1. number가 10보다 작으면 "한자리 숫자입니다"가 출력되게 코드를 작성하세요.
// 문제2. number가 홀수이면 "홀수입니다" 가 출력되게 코드를 작성하세요.
// 문제3. number가 3의 배수가 아닐 경우에는 "3의 배수가 아닙니다" 가 출력되게 코드를 작성하세요
// 문제4. 사용자로부터 나이를 입력받아서 미성년자면 "미성년자입니다." 가 출력되게 코드를 작성하세요
// 문제5. 사용자로부터 숫자를 입력받아서 두자리 양의정수이면 "두자리 양의정수입니다."가 출력되게 코드를 작성하세요

import java.util.Scanner;
public class Ex09If02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = 5;
		
		System.out.println("---------문제1---------");
		if(number < 10) {
			System.out.println("한자리 숫자입니다");
		}
		System.out.println("----------------------\n");

		System.out.println("---------문제2---------");
		if(number % 2 == 1) {
			System.out.println("홀수입니다.");
		}
		System.out.println("----------------------\n");
		
		System.out.println("---------문제3---------");
		if(number % 3 != 0) {
			System.out.println("3의 배수가 아닙니다.");
		}
		System.out.println("----------------------\n");
		
		System.out.println("---------문제4---------");
		// 1. 사용자로부터 나이를 입력받는다.
		System.out.println("나이를 입력해주세요.");
		int age = scanner.nextInt();
		if(age < 19) {
			System.out.println("미성년자입니다.");

		// 2. if 조건문을 사용하여 나이가 미성년자, 즉 19 미만이면
		//    "미성년자입니다." 를 출력한다.
		System.out.println("----------------------\n");

		System.out.println("---------문제5---------");
		// 1. 사용자로부터 숫자를 입력받는다.
		System.out.println("숫자를 입력해주세요.");
		int userNumber = scanner.nextInt();
		
		// 2. if 조건문을 사용하여 사용자가 입력한 숫자가
		//    10보다 크거나 같고 && 99보다 작거나 같다
		//    2가지 조건식이 모두 true가 나오면
		//    "두자리 양의 정수입니다."를 출력한다.
		
	if (userNumber >= 10 && userNumber <= 99) {
		System.out.println("두자리 양의 정수입니다.");
	}
		System.out.println("----------------------\n");


	}
	}
}




