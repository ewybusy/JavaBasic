package day01;
// ������(Operator)
// �����ڶ�, ���� ��ȣ�� ���α׷��� ����� ���ǵǾ��־
// �ش� ��ȣ�� �ڵ忡 ���������� �� ��ȣ�� ���ǵ� ����� ����ȴ�.

// �����ڿ��� ũ��
// ���, �Ҵ�, ��, ��, ��Ʈ ������ 5������ �ִ�.
// ������ �� �� ��Ʈ �����ڴ� �츮�� ����� �ʴ´�.

// ���������
// + - * / %
// + : ������ ���� ���� ���� ���� ���� ������� ���Ѵ�.
// - : ������ ���� ������ ���� ���� �� ������� ���Ѵ�.
// * : ������ ���� ���� ���� ���� ���� ������� ���Ѵ�.
// / : ������ ���� ���� ���� ������ ���� "��"�� ���Ѵ�.
// % : ������ ���� ���� ���� ������ ���� "������"�� ���Ѵ�.

// ����������� ���,
// ���� ����(������ ���� Ȥ�� �Ǽ��� �Ǽ�)�� �����;����� �����ϸ� �ش� ������Ÿ���� ����� ��������
// �ٸ� ����(������ �Ǽ�)�� �����;����� �����ϸ� �����ͼս��� �߻����� �ʴ� ������Ÿ���� ����� ���´�.

// ���� ���п����� �켱������ �״�� ����ǹǷ� *, /, %�� +, -���� ���� ���� �ȴ�.

// �ٸ� �����ڵ鵵 ��������������, ���� �켱������ �����ڰ� �������� ���� ���,
// ���ʺ��� ���ʴ�� ������ �ȴ�.
// ���� ��� 1 + 2 + 3�� ���� ���
// ���� 1 + 2 �� ����Ǽ� 3�̶�� ������� ������
// �� �Ŀ� 3�̶�� ������� 3�� ���Ͽ� 6�� ��������� ���´ٴ� �ǹ̰� �ȴ�.


public class Ex12Operator {
	public static void main(String[] args) {
		// 1. int������ ����
		System.out.println("1. int ������ ����");
		// int number1, number2 ����
		int number1 = 13;
		int number2 = 4;
		System.out.println("A. number1 + number2");
		System.out.println(number1 + number2);
		
		System.out.println("B. number1 - number2");
		System.out.println(number1 - number2);
		
		System.out.println("C. number1 * number2");
		System.out.println(number1 * number2);
		
		System.out.println("D. number1 / number2");
		System.out.println(number1 / number2);
		
		System.out.println("E. number1 % number2");
		System.out.println(number1 % number2);
		
		System.out.println("2. double������ ����");
		double d1 = 13.0;
		double d2 = 4.0;
		
		System.out.println("A. d1 + d2");
		System.out.println(d1 + d2);
		System.out.println("B. d1 - d2");
		System.out.println(d1 - d2);
		System.out.println("C. d1 * d2");
		System.out.println(d1 * d2);
		System.out.println("D. d1 / d2");
		System.out.println(d1 / d2);
		System.out.println("E. d1 % d2");
		System.out.println(d1 % d2);
		
		// 3. ������ �Ǽ��� ��� ����
		System.out.println("3. int�� double�� �������");
		System.out.println("A. number1 + d2");
		System.out.println(number1 + d2);
		System.out.println("B. number1 - d2");
		System.out.println(number1 - d2);
		System.out.println("C. number1 * d2");
		System.out.println(number1 * d2);
		System.out.println("D. number1 / d2");
		System.out.println(number1 / d2);
		System.out.println("E. number1 % d2");
		System.out.println(number1 % d2);
		
		// String�� ���, + ������ �����ѵ�
		// �̶����� ���� String ���� ���� String ���� �̾�ٿ���
		// ���ο� String ���� ������ �ǹ̰� �ȴ�.
		System.out.println("a" + "b");
		System.out.println("12" + 34 + d2);
		System.out.println(12 + d2 + "34");
	}
}











