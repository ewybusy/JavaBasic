package day03;
// ���α׷��ֿ��� 2���� ���� ���� ��ȯ�ϱ�
public class Ex08Swap {
	public static void main(String[] args) {
		// int number1, number2 ����
		int number1, number2;
		// number1�� 20 ����
		number1 = 20;
		// number2�� 50 ����
		number2 = 50;
		
		// number1�� ���� �ӽ÷� ������ int ���� temp
		int temp;
		
		// number1�� ���� ���� temp�� ����
		temp = number1;
		
		// number1�� number2�� ���� �� ����
		number1 = number2;
		
		// number2�� temp�� ���� �� ����
		number2 = temp;
		
		// number1�� number2 ���
		System.out.println(number1);
		System.out.println(number2);
		
		
	}

}
