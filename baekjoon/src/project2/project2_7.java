package project2;

import java.util.Scanner;

public class project2_7 {

	public static void main(String[] args) {
		
		/* A + B - 2
		 * ���� : �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * �Է� : ù° �ٿ� A, ��° �ٿ� B�� �־�����.(0 < A, B < 10)
		 * ��� : ù° �ٿ� A + B�� ����Ѵ�.
		 * Tip : A+B ���� �ҽ��� �����ϰ� �ۼ��Ͻø� �ǰڽ��ϴ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println(a+b);
	}

}
