package project2;

// 이문제에서도 Scanner 함수를 이용해주도록하자.
import java.util.Scanner;

public class project2_1 {

	public static void main(String[] args) {
		/* A + B
		 * 문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		 * 입력 : 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
		 * 출력 : 첫째 줄에 A+B를 출력한다.
		 * Tip : 이 문제에서는 int 함수를 이용하여 출력을 해주도록하자!
		 */
		Scanner sc = new Scanner(System.in);
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a+b);

	}

}
