package day03;
// ����ڷκ��� ������ �Է¹޾Ƽ�
// A, B, C, D, F�� ��µǴ� ���α׷��� �ۼ��غ�����.

// 1. �Է� �غ�
// 2. ���� �Է�
// 3. ��� ���

import java.util.Scanner; // �Է�â ����ϰ� �Ϸ��� �ʼ�
public class Ex01LetterGrade {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // �Է�â ����ϰ� �Ϸ��� �ʼ�(scanner)
		
		System.out.println("������ �Է����ּ���: "); // �Է�â ���
		int score = scanner.nextInt(); // ���� �Է�â ��½� �ʼ�(score,scanner)
		
		if( score >= 100) {
			System.out.println("A");
		} else if(score >= 90) {
			System.out.println("B");
		} else if(score >= 80) {
			System.out.println("C");
		} else if(score >= 70) {
			System.out.println("D");
		} else {
			System.out.println("F");			
		}
	}
}


