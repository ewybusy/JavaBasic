package day02;
// 1. int ���� number�� �����
//	  5�� �����ϼ���
// ����1. number�� 10���� ������ "���ڸ� �����Դϴ�"�� ��µǰ� �ڵ带 �ۼ��ϼ���.
// ����2. number�� Ȧ���̸� "Ȧ���Դϴ�" �� ��µǰ� �ڵ带 �ۼ��ϼ���.
// ����3. number�� 3�� ����� �ƴ� ��쿡�� "3�� ����� �ƴմϴ�" �� ��µǰ� �ڵ带 �ۼ��ϼ���
// ����4. ����ڷκ��� ���̸� �Է¹޾Ƽ� �̼����ڸ� "�̼������Դϴ�." �� ��µǰ� �ڵ带 �ۼ��ϼ���
// ����5. ����ڷκ��� ���ڸ� �Է¹޾Ƽ� ���ڸ� ���������̸� "���ڸ� ���������Դϴ�."�� ��µǰ� �ڵ带 �ۼ��ϼ���

import java.util.Scanner;
public class Ex09If02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = 5;
		
		System.out.println("---------����1---------");
		if(number < 10) {
			System.out.println("���ڸ� �����Դϴ�");
		}
		System.out.println("----------------------\n");

		System.out.println("---------����2---------");
		if(number % 2 == 1) {
			System.out.println("Ȧ���Դϴ�.");
		}
		System.out.println("----------------------\n");
		
		System.out.println("---------����3---------");
		if(number % 3 != 0) {
			System.out.println("3�� ����� �ƴմϴ�.");
		}
		System.out.println("----------------------\n");
		
		System.out.println("---------����4---------");
		// 1. ����ڷκ��� ���̸� �Է¹޴´�.
		System.out.println("���̸� �Է����ּ���.");
		int age = scanner.nextInt();
		if(age < 19) {
			System.out.println("�̼������Դϴ�.");

		// 2. if ���ǹ��� ����Ͽ� ���̰� �̼�����, �� 19 �̸��̸�
		//    "�̼������Դϴ�." �� ����Ѵ�.
		System.out.println("----------------------\n");

		System.out.println("---------����5---------");
		// 1. ����ڷκ��� ���ڸ� �Է¹޴´�.
		System.out.println("���ڸ� �Է����ּ���.");
		int userNumber = scanner.nextInt();
		
		// 2. if ���ǹ��� ����Ͽ� ����ڰ� �Է��� ���ڰ�
		//    10���� ũ�ų� ���� && 99���� �۰ų� ����
		//    2���� ���ǽ��� ��� true�� ������
		//    "���ڸ� ���� �����Դϴ�."�� ����Ѵ�.
		
	if (userNumber >= 10 && userNumber <= 99) {
		System.out.println("���ڸ� ���� �����Դϴ�.");
	}
		System.out.println("----------------------\n");


	}
	}
}




