package project2;

import java.util.Scanner;

public class project2_6 {

	public static void main(String[] args) {
		/* ������
		 * ���� : (A + B) % C �� (A % C + B % C) % C �� ������?
		 * 		(A * B) % C �� (A % C * B % C) % C �� ������?
		 * 		�� �� A, B, C�� �־����� ��, ���� �װ��� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * �Է� : ù° �ٿ�  A, B, C�� ������� �־�����.(2 <= A, B, C <= 10000)
		 * ��� : ù° �ٿ� (A + B) % C, ��° �ٿ� (A % C + B % C) % C, ��° �ٿ� (A * B) % C, ��° �ٿ� (A % C * B % C) % C�� ����Ѵ�.
		 */
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		System.out.println((a+b)%c);
		System.out.println((a%c+b%c)%c);
		System.out.println((a*b)%c);
		System.out.println((a%c*b%c)%c);

	}

}
