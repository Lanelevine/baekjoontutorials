package project2;

// ��Ģ������ Scanner�Լ��� �� ���ֵ��� ����
import java.util.Scanner;

public class project2_3 {

	public static void main(String[] args) {
		/* A * B
		 * ���� : �� ���� A�� B�� �Է¹��� ����, A*B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * �Է� : ù° �ٿ� A�� B�� �־�����.(0 < A, B < 10)
		 * ��� : ù° �ٿ�  A * B�� ����Ѵ�.
		 * Tip : int ������ ������ ������ִ� �� �������!
		 */
		Scanner sc = new Scanner(System.in);
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a*b);

	}

}
