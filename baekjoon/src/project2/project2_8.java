package project2;

import java.util.Scanner;

public class project2_8 {

	public static void main(String[] args) {
		/* ���� ���
		 * ���� : ����̴� ���� �������忡�� ������ ����ϰ� �ִ�. ����̴� ���� �������Կ� ������ ��Ȯ�ϰ� Nų�α׷��� ����ؾ��Ѵ�.
		 * 		�������忡�� ����� ������ ������ ����� �ִ�. ������ 3ų�α׷� ������ 5ų�α׷� ������ �ִ�.
		 *		 ����̴� ������ ������, �ִ��� ���� ������ ��� ������ �Ѵ�. ���� ���, 18ų�α׷� ������ ����ؾ� �� ��, 3ų�α׷�
		 *		6������ �������� ������, 5ų�α׷� 3���� 3ų�α׷� 1���� ����ϸ�, �� ���� ������ ������ ����� �� �ִ�.
		 *		����̰� ������ ��Ȯ�ϰ� Nų�α׷� ����ؾ� �� ��, ���� �� ���� �������� �Ǵ��� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * �Է� : ù° �ٿ� N�� �־�����.(3 <= N <= 5000)
		 * ��� : ����̰� ����ϴ� ������ �ּ� ������ ����Ѵ�. ����, ��Ȯ�ϰ� Nų�α׷��� ���� �� ���ٸ� -1�� ����Ѵ�.
		 */
Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextInt()) {
			int A = scan.nextInt();
			int x=0, i=0, j=0;
			

Loop1:		for(i=0; i<=A/3; i++) {
				for(j=0; j<=A/5; j++) {
					if(A-(i*3)-(j*5)==0) {
						System.out.println(i+j);
						x=1;
						break Loop1;
							
					}
				}
			}			
			if(x==0) {
				System.out.println("-1");
			}
		}	
		scan.close();
	}
	
}