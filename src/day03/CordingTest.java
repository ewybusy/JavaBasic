// ��Ʈķ�� �ڹ� �����ڵ���
// �����


package day03;


import java.util.Scanner;
public class CordingTest {
	public static void main(String[] args) {
		int number1;
		int number2;
		int number3;

		Scanner	scanner = new Scanner(System.in);

		System.out.print("ù��° ���ڸ� �Է��Ͽ��ּ��� : ");
		number1 = scanner.nextInt();

		System.out.print("�ι�° ���ڸ� �Է��Ͽ��ּ��� : ");
		number2 = scanner.nextInt();
		
		System.out.print("����° ���ڸ� �Է��Ͽ��ּ��� : ");
		number3 = scanner.nextInt();
		
		System.out.println("����ڰ� �Է��� ���� ");
		System.out.println();
		
		int sum;
		int sum1;
		
		sum = number1 + number2 + number3;
		sum1 = number1 * number2 * number3;
		
		System.out.println("�� ������ ��");
		System.out.println(sum);
		
		System.out.println("�� ������ �� : ");
		System.out.println(sum1);
		

	}

	
}

