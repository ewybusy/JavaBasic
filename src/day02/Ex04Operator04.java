package day02;
// �� ������

// �� �����ڴ� boolean���� ���� ������ �Ѵ�.

// &&: ���ʰ� �������� ��� true�� ������ ������� true�� �ȴ�.
// ||: ���ʰ� ������ �� �ϳ��� true�̸� ������� true�� �ȴ�.
// !: true�� false�� false�� true�� �����Ѵ�.

public class Ex04Operator04 {
	public static void main(String[] args) {
		// 1. &&
		System.out.println("1. &&");
		System.out.println("true && true: " + (true && true));
		System.out.println("true && false: " + (true && false));
		System.out.println("false && true: " + (false && true));
		System.out.println("false && false: " + (false && false));

		// 2. ||
		System.out.println("2. ||");
		System.out.println("true || true: " + (true || true));
		System.out.println("true || false: " + (true || false));
		System.out.println("false || true: " + (false || true));
		System.out.println("false || false: " + (false || false));

		// 2. !
		System.out.println("3. !");
		System.out.println("!true: " + (!true));
		System.out.println("!false: " + (!false));

		// int ���� 0 ���� 10�������� üũ�ϴ� �ڵ�
		// �츮�� ���п��� ����� ����?
		// 0 <= x <= 10
		int x = 6;
		// System.out.println("0 <= x <= 10: " + (0 <= x <=10));
		// �� �ڵ�� ���� 0 <= x �� ���Ͽ� boolean ������� ������ �Ǵµ�
		// boolean ���� int�� ���� �� �����Ƿ� ������ �߻��Ѵ�.

		// ��, ������ ���� üũ�Ѵٰ� �Ѵٸ�
		// x�� Ư���� ���� ũ�� �׸��� Ư�������� �۴� �� ��� true�� ���� ������
		// ������� true�� ������ �� �����ڸ� ������־�� �Ѵ�.
		System.out.println("0 <= x && <= 10: " + (0 <= x && x <= 10));

	}

}
