package day02;
// �� ������

// �񱳿����ڴ� ���� ���� ������ ���� ���ϵ�
// ������� �� ũ�� Ȥ�� �� �۴ٰ� ��������� ������ ���� �ƴ϶�
// "������ ���� ���� �������� ���� ������ �۽��ϱ�?" true/false
// �� �������� �����ϸ� �� ����.

public class Ex03Operator03 {
	public static void main(String[] args) {
		// int ���� number1�� number2�� �����ϰ� ���� 5�� 6�� ����
		int number1 = 5;
		int number2 = 6;
		// 1. >
		System.out.println("1. > ");
		System.out.println("number1 > 0: " + (number1 > 0));
		System.out.println("number1 > number2: " + (number1 > number2));
		System.out.println("number1 > 5: " + (number1 > 5));

		// 2. >=
		System.out.println("2. >= ");
		System.out.println("number1 >= 0: " + (number1 >= 0));
		System.out.println("number1 >= number2: " + (number1 >= number2));
		System.out.println("number1 >= 5: " + (number1 >= 5));

		// 3. ==
		// ������ ���� ���� �������� ���� ���� ������ true, �ٸ��� false�� ���´�.
		System.out.println("3. == ");
		System.out.println("number1 == 5: " + (number1 == 5));
		System.out.println("number1 == number2: " + (number1 == number2));

		// 3. !=
		// ������ ���� ���� �������� ���� ���� �ٸ��� true, �ٸ��� false�� ���´�.
		System.out.println("4. != ");
		System.out.println("number1 != 5: " + (number1 != 5));
		System.out.println("number1 != number2: " + (number1 != number2));

		// ��, 2���� ���� ������ ���� ����
		// ������ ������Ÿ���� ��쿡��
		// ==�� �ƴ� equals() ��� �޼ҵ带 ����Ͽ� ���ؾ��Ѵ�.
		// �ֳ��ϸ�, �񱳿����ڴ� ������ ������ ����� ���� ���� �����ִ� ���� �ƴ϶�
		// �ش� ������ ���� ����Ǿ��ִ� �ּҰ��� ���ϱ� �����̴�.

		// String ���� 2���� ���� ���ϵ�
		// �����ϴ� ����� �ٸ��� �غ���.
		String str1 = "abc";
		String str2 = new String("abc");

		// str1�� str2�� ����ִ� ���� ����غ���
		System.out.println("str1: [" + str1 + "]");
		System.out.println("str2: [" + str2 + "]");

		System.out.println("str1 == str2: " + (str1 == str2));
		System.out.println("str1.equals(str2): " + str1.equals(str2));
	}
}
