package day03;
// 사용자로부터 키와 몸무게를 입력받아서
// BMI 를 계산하고 비만도를 출력해주는 프로그램.
// BMI 공식은 몸무게(kg) / 키(m) / 키(m) 입니다.

// 기네스북에 따르면 세계에서 가장 키가 컸던 사람은 2.72m였습니다.
// 기네스북에 따르면 세계에서 가장 몸무게가 무거웠던 사람은 635kg였습니다.

// 비만도
// ~18.5 미만 : 저체중
// ~23 미만 : 정상체중
// ~25 미만 : 과체중
// 25~ : 비만
import java.util.Scanner;
public class Ex07BmiChecker {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			// 키 입력
			System.out.print("키: ");
			double height = scanner.nextDouble();
			
			while(height > 2.72 || height <= 0) {
				// 잘못된 키 이므로 다시 입력을 받는다.
				System.out.println("잘못 입력하셨습니다.");
				System.out.print("키: ");
				height = scanner.nextDouble();
			}
			
			// 몸무게 입력
			System.out.print("몸무게: ");
			double weight =  scanner.nextDouble();
			
			while(weight > 635 || weight <= 0) {
				System.out.println("잘못 입력하셨습니다.");
				System.out.print("몸무게: ");
				weight = scanner.nextDouble();
				
			}
			
			// BMI 계산
			double bmi = weight / height / height;
			
			// 결과 출력
			if(bmi < 18.5) {
				System.out.println("저체중");
			}else if(bmi < 23) {
				System.out.println("정상체중");
			}else if(bmi < 25) {
				System.out.println("과체중");
			} else {
				System.out.println("비만");
			}

		}	

}
