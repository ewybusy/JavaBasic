package day02;
// if-else ����

// if-else ����������
// if ���ǽ��� true�� ������
// if ���ǽĿ� ����� �ڵ� ����� ����ǰ�
// false�� ������
// else�� ����� �ڵ� ����� ����ȴ�.

// �⺻���� if-else ������ ������ ���� �����.

// if(���ǽ�) {
//		���ǽ��� ���϶� ������ �ڵ�
// } else {
//      ���ǽ��� �����϶� ������ �ڵ�
// }
public class Ex10IfElse {
	public static void main(String[] args) {
		// int ���� number ���� �� 5 ����
		int number = 5;

		// if- else ������ ����Ͽ�
		// number�� 0 �̻��̸� "�ڿ����Դϴ�." �� ��µǰ�
		// �� �ܿ��� "���� �����Դϴ�."�� ��µǰ� �ڵ带 �ۼ�
		//

		if (number >= 0) {
			System.out.println("�ڿ����Դϴ�.");
		} else {
			System.out.println("���� �����Դϴ�.");
		}
	}

}
