package day03;
// ��ø if��
// �� ���� if�� block �ȿ�
// ���ο� if���� �� ���� ���°� �ȴ�.

// int ���� number�� ���� ���� �̸�
// "���� �����Դϴ�." �� ��µǰ�, �� �ܿ��� "���� ������ �ƴմϴ�." �� ��µǴ� ���α׷�.
// ��, number�� ���ڸ� ���� �����̸� ���� �޽����� �߰��� "���ڸ� ���� ���� �Դϴ�." �� ��µȴ�.

public class Ex02NestedIf {
	public static void main(String[] args) {
		int number = -61;
		
		if(number > 0) {
			System.out.println("���� �����Դϴ�.");
			
			if(number < 10) {
				System.out.println("���ڸ� ���� �����Դϴ�.");
			}
			
		} else {
			System.out.println("���� ������ �ƴմϴ�.");
		}
		
	}

}
