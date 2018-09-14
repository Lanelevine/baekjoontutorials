package project2;

import java.util.Scanner;

public class project2_2 {

	public static void main(String[] args) {
		/* A - B
		 * 문제 : 두 정수 A와 B를 입력받은 다음, A - B 를 출력하는 프로그램을 작성하시오.
		 * 입력 : 첫째 줄에 A와 B가 주어진다.(0 < A, B <10)
		 * 출력 : 첫째 줄에 A - B를 출력한다.
		 * Tip : project2_1과 소스는 거의 동일하다.
		 */
		Scanner sc = new Scanner(System.in);
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a-b);
		

	}

}