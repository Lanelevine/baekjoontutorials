package project2;

import java.util.Scanner;

public class project2_4 {

	public static void main(String[] args) {
		/* A / B
		 * ���� : �� ���� A�� B�� �Է¹��� ����, A / B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * �Է� : ù° �ٿ� A�� B�� �־�����.(0 < A, B < 10)
		 * ��� : ù° �ٿ� A / B�� ����Ѵ�. ����/��� ������ 	  -9���� ����Ѵ�.
		 * 										10
		 * Tip : ���⼭�� �Ҽ������� ���� �� ������ Double ������ �̿����ֵ��� ����.
		 */
		Scanner sc = new Scanner(System.in);
		double a,b;
		a = sc.nextDouble();
		b = sc.nextDouble();
		System.out.println(a/b);

	}

}
