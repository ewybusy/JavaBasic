package day03;
// ����(Validation)
// ���α׷��ֿ��� ������ �ַ�
// ����ڰ� �Է��� �� Ȥ��
// �ڵ带 �����ϸ鼭 Ư�� ������ ����
// �ùٸ� ������ üũ�ϴ� ������ �����̶�� �Ѵ�.

// ������ ���� ������� �� �� ������,
// �츮�� ���⼭
// �ΰ��� ���� ����� �˾ƺ� ���̴�!

import java.util.Scanner; // �Է�â ����ϰ� �Ϸ��� �ʼ�
public class Ex04Validation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // �Է�â ����ϰ� �Ϸ��� �ʼ�(scanner)
		
		System.out.println("������ �Է����ּ���: "); // �Է�â ���
		int score = scanner.nextInt(); // ���� �Է�â ��½� �ʼ�(score,scanner)
		
		System.out.println("�� ������ �ȵ� ���");
		
		System.out.println("----------------------\n");
		
		// �� �����ϱ� 1��
		// ���ǽ��� ��Ȯ�ϰ� ���
		System.out.println("���ǽ� ��Ȯ�ϰ� ���");
		
		if(score >= 90 && score <=100) {
			System.out.println("A");
		} else if(score >= 80 && score <= 89) {
			System.out.println("B");
		} else if(score >= 70 && score <= 79) {
			System.out.println("C");
		} else if(score >= 60 && score <= 69) {
			System.out.println("D");
		} else if(score >= 0 && score <= 59) {
			System.out.println("F");
		} else {
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
		}
		
		// �̷�����Ȯ�� ���ǽ����� ����� ���ϴ� �����
		// �ַ� �Է°��� �ùٸ� ������ ���ӵ��� ���� ���
		// ����� �ȴ�.
		//
		
		System.out.println("----------------------\n");
		
		System.out.println("���� �Է� ���� �ùٸ� ��ü ������ ���ϴ��� üũ�ϱ�");
		
		if(score >= 0 && score <= 100) {
			// �Էµ� ������ �ùٸ� �����̹Ƿ�
			// ��� ����ϴ� if�� ����
			
			if( score >= 90) {
				System.out.println("A");
			} else if(score >= 80) {
				System.out.println("B");
			} else if(score >= 70) {
				System.out.println("C");
			} else if(score >= 60) {
				System.out.println("D");
			} else {
				System.out.println("F");			
			}
			
		} else {
			// �Էµ� ������ �ùٸ��� ���� �����̹Ƿ�
			// ��� �޽����� ���
			System.out.println("�߸��� ������ �����Դϴ�.");
		}
		
		
		System.out.println("----------------------\n");
		
		
		
	}
}


