package day02;
// ����ڷκ���

// ��ȣ, �̸�, ����, ����, ���м����� �Է��� �޾Ƽ�
// ������ ���� �������� ��µǴ� ���α׷��� �ۼ��Ͻÿ�.
// ��, �Ǽ��� 6�ڸ��� ���߾� ���� �����ϰ� ���� �� ������ ������ 0���� ä���
// �Ҽ����� 2��° �ڸ����� ǥ���� ������
// %06.2f �� ����ϸ� �˴ϴ�.
// ���� String ���� %s�� ����ϰ� �˴ϴ�.

// ���)))))
// ��ȣ : 0##�� �̸� : ###
// ���� : 0##�� ���� : 0##�� ����: 0##��
// ���� : 0##�� ��� : 0##.##��

// 1. Scanner ����Ʈ
// 2. Scanner ���� ���� �� �ʱ�ȭ
// 3. ��ȣ �Է�
// 4. �̸� �Է�
// 5. ���� �Է�
// 6. ���� �Է�
// 7. ���� �Է�
// 8. ���� ���
// 9. ��� ���
// 10. ��ȣ �̸� ���
// 11. ���� ���� ���� ���
// 12. ���� ��� ���

import java.util.Scanner;

public class Ex07GradeBook {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("��ȣ: ");
		int bunho = scanner.nextInt();

		System.out.print("�̸�: ");
		scanner.nextLine();
		String name = scanner.nextLine();

		System.out.print("����: ");
		int korean = scanner.nextInt();

		System.out.print("����: ");
		int english = scanner.nextInt();

		System.out.print("����: ");
		int math = scanner.nextInt();

		int sum = korean + english + math;

		double average = (double) sum / 3;

		System.out.printf("��ȣ: %03d�� �̸�: %s\n", bunho, name);
		System.out.printf("����: %03d�� ����: %03d�� ����: %03d��\n", korean, english, math);
		System.out.printf("����: %03d�� ���: %06.2f��\n", sum, average);

	}

}
