package project2;

import java.util.Scanner;

public class project2_4 {

	public static void main(String[] args) {
		/* A / B
		 * 문제 : 두 정수 A와 B를 입력받은 다음, A / B를 출력하는 프로그램을 작성하시오.
		 * 입력 : 첫째 줄에 A와 B가 주어진다.(0 < A, B < 10)
		 * 출력 : 첫째 줄에 A / B를 출력한다. 절대/상대 오차는 	  -9까지 허용한다.
		 * 										10
		 * Tip : 여기서는 소숫점까지 나올 수 있으니 Double 선언문을 이용해주도록 하자.
		 */
		Scanner sc = new Scanner(System.in);
		double a,b;
		a = sc.nextDouble();
		b = sc.nextDouble();
		System.out.println(a/b);

	}

}
