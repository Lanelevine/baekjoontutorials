package project2;

// 사칙연산에서 Scanner함수를 필수적으로 들어간다 생각해주자.
import java.util.Scanner;

public class project2_5 {

	public static void main(String[] args) {
		/* 사칙연산
		 * 문제 : 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오
		 * 입력 : 두 자연수 A와 B가 주어진다.(1 <= A, B <= 10,000)
		 * 첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
		 * Tip : 여기서는 project2_1~4까지 했던것과 나눗셈 모두 적어주면 된다.
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
