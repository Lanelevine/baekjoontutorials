package project2;

// �̹��������� Scanner �Լ��� �̿����ֵ�������.
import java.util.Scanner;

public class project2_1 {

	public static void main(String[] args) {
		/*
		 * ���� : �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * �Է� : ù° �ٿ� A�� B�� �־�����. (0 < A, B < 10)
		 * ��� : ù° �ٿ� A+B�� ����Ѵ�.
		 * Tip : �� ���������� int �Լ��� �̿��Ͽ� ����� ���ֵ�������!
		 */
		Scanner sc = new Scanner(System.in);
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a+b);

	}

}
