package day03;
// ���� �ݺ����� ����Ͽ� ���α׷� �޴�ȭ�� ������
import java.util.Scanner;
public class Ex10Menu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. 1�� ��� ���� 2. 2�� ��� ���� 3. 3�� ��� ���� 4. ����");
			System.out.println("> ");
			int userChoice = scanner.nextInt();
			
			if( userChoice == 1) {
				System.out.println("1�� ��� �ڵ� ����");
			}else if(userChoice == 2) {
				System.out.println("2�� ��� �ڵ� ����");
			}else if(userChoice == 3) {
				System.out.println("3�� ��� �ڵ� ����");
			}else if(userChoice == 4) {
				// break Ű����� �ݺ��� Ȥ�� switch ���ǹ��� �ڵ� �����
				// ���� �����Ű�� Ű�����̴�.
				System.out.println("������ּż� �����մϴ�.");
				break;
			}
		}
	}
}
