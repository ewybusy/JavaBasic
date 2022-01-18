package day03;
// ����ڷκ��� Ű�� �����Ը� �Է¹޾Ƽ�
// BMI �� ����ϰ� �񸸵��� ������ִ� ���α׷�.
// BMI ������ ������(kg) / Ű(m) / Ű(m) �Դϴ�.

// ��׽��Ͽ� ������ ���迡�� ���� Ű�� �Ǵ� ����� 2.72m�����ϴ�.
// ��׽��Ͽ� ������ ���迡�� ���� �����԰� ���ſ��� ����� 635kg�����ϴ�.

// �񸸵�
// ~18.5 �̸� : ��ü��
// ~23 �̸� : ����ü��
// ~25 �̸� : ��ü��
// 25~ : ��
import java.util.Scanner;
public class Ex07BmiChecker {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			// Ű �Է�
			System.out.print("Ű: ");
			double height = scanner.nextDouble();
			
			while(height > 2.72 || height <= 0) {
				// �߸��� Ű �̹Ƿ� �ٽ� �Է��� �޴´�.
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				System.out.print("Ű: ");
				height = scanner.nextDouble();
			}
			
			// ������ �Է�
			System.out.print("������: ");
			double weight =  scanner.nextDouble();
			
			while(weight > 635 || weight <= 0) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				System.out.print("������: ");
				weight = scanner.nextDouble();
				
			}
			
			// BMI ���
			double bmi = weight / height / height;
			
			// ��� ���
			if(bmi < 18.5) {
				System.out.println("��ü��");
			}else if(bmi < 23) {
				System.out.println("����ü��");
			}else if(bmi < 25) {
				System.out.println("��ü��");
			} else {
				System.out.println("��");
			}

		}	

}
