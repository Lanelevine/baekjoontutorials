package project2;

// ��Ģ���꿡�� Scanner�Լ��� �ʼ������� ���� ����������.
import java.util.Scanner;

public class project2_5 {

	public static void main(String[] args) {
		/* ��Ģ����
		 * ���� : �� �ڿ��� A�� B�� �־�����. �̶�, A+B, A-B, A*B, A/B(��), A%B(������)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		 * �Է� : �� �ڿ��� A�� B�� �־�����.(1 <= A, B <= 10,000)
		 * ù° �ٿ� A+B, ��° �ٿ� A-B, ��° �ٿ� A*B, ��° �ٿ� A/B, �ټ�° �ٿ� A%B�� ����Ѵ�.
		 * Tip : ���⼭�� project2_1~4���� �ߴ��Ͱ� ������ ��� �����ָ� �ȴ�.
		 */
		Scanner sc = new Scanner(System.in);
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);

	}
}
