package day03;
// ����ڷκ��� 0�̻��� �ڿ����� �Է¹޴� ���α׷�
// ���� ����ڰ� �ڿ����� �ƴ� ���ڸ� �Է��ϸ�
// �ٽ� �Է��� �޴´�.

import java.util.Scanner;
public class Ex06While02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("0�̻��� �ڿ���: ");
		int number = scanner.nextInt();
		
		while(number < 0) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			System.out.print("0 �̻��� �ڿ���: ");
			number = scanner.nextInt();
		}
		
		
		System.out.println("����ڰ� �Է��� �ڿ���: " + number);
	}

}
