package day02;
// if - else if ����
// ����, �츮�� �̾Ƴ����� ����� true/false �ΰ����� �����ϴ� ���� �ƴ϶�
// 1�� ���� üũ -> 2�� ���� üũ -> 3�� ���� üũ.....
// �̷������� �پ��� ����� ó���ؾ��� ���
// �츮�� if - else if ������ ����ؾ��Ѵ�.

// if - else if �� ������ ���� ������ ������.
// if( ���ǽ�1 ) {
//   ���ǽ�1�� ���϶� ������ �ڵ�
// } else if( ���ǽ�2 ) {
//  ���ǽ�1�� false�� ���԰�
//  ���ǽ�2�� true�� �������� ������ �ڵ�
//
// } else if( ���ǽ�3 ) {
// ���ǽ�1, ���ǽ�2�� false�� ���԰�
// ���ǽ�3�� true�� �������� ������ �ڵ�
// } else {
// ���� ��� ���ǽ��� false�� ������ �� ������ �ڵ�
// }

import java.util.Scanner; // �Է�â ����ϰ� �Ϸ��� �ʼ�
public class Ex11IfElseIf {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // �Է�â ����ϰ� �Ϸ��� �ʼ�(scanner)
		System.out.println("���̸� �Է����ּ���:"); // ���� �Է�â ���
		int age = scanner.nextInt(); // ���� �Է�â ��½� �ʼ�(age,scanner)
		
		if( age <= 5) {
			System.out.println("�����Դϴ�.");
		} else if(age <= 13) {
			System.out.println("����Դϴ�.");
		} else if(age <= 18) {
			System.out.println("û�ҳ��Դϴ�.");
		} else {
			System.out.println("�����Դϴ�.");			
		}
	}
}
