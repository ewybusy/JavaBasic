package day02;
// Scanner Ŭ���� -> �Է�â ����
// �ڹٿ��� �Է��� ó���� ������
// �츮�� Scanner Ŭ���� ������ ����
// �� ������ �޼ҵ带 ������Ѽ� �Է��� ó���ϰ� �ȴ�.
// ��, Scanner Ŭ������ �ܺο� �����ϴ� Ŭ�����̱� ������
// �츮�� ����ϱ� ���ؼ��� �ݵ�� "����"�ؿ;� �Ѵ�.

// �ܺ� Ŭ������ �����ϴ� ���
// import ��Ű���̸�.Ŭ�����̸�;
// �� public class ~~~~ ������ �����ָ� �ȴ�.

import java.util.Scanner;

public class Ex06Scanner {
	public static void main(String[] args) {
		// Scanner Ŭ���� ������ �ʱ�ȭ�� ������
		// �ش� Ŭ���� ������ ��𿡼� �Է°��� �о������
		// �������־�� �Ѵ�.
		// Ű���� �Է��� System.in �̶�� ������ �о���Ƿ�
		// Scanner scanner = new Scanner(System.in)
		// ���� Scanner Ŭ���� ������ ����� �ʱ�ȭ�� ���־�� �Ѵ�.
		Scanner scanner = new Scanner(System.in);
		
		// 1. ���� �Է¹ޱ�
		//    ����(=int)�� Scanner Ŭ���� ������ nextInt() �޼ҵ带 ����ϸ� �ȴ�.
		System.out.print("������ �Է����ּ���: ");
		int score = scanner.nextInt();
		System.out.println("����ڰ� �Է��� ����: " + score);
		
		// 2. �Ǽ� �Է¹ޱ�
		//    nextDouble()
		System.out.print("�Ǽ��� �Է����ּ���: ");
		double myDouble = scanner.nextDouble();
		System.out.println("����ڰ� �Է��� �Ǽ�: " + myDouble);
		
		// 3. String �Է¹ޱ�
		//    enxtLine()
		// Scanner Ŭ������ nextLine() ���׸� �ذ��� ������
		// ����Ű ���ſ� nextLine()�� �ѹ� ��������ְ�
		// �� ������ ���� �� �Է��� ����� nextLine()�� �����Ű�� �ȴ�.	
		System.out.print("�̸��� �Է����ּ���:");
		scanner.nextLine();
		String name = scanner.nextLine();
		System.out.println("������� �̸�: [" + name + "]");
		
		
	}

}
