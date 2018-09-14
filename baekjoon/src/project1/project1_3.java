package project1;
/*문제 : 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.*/
//스캐너 유틸 추가
import java.util.Scanner;

public class project1_3 {

	public static void main(String[] args) {
		// 스캐너 선언을 이용한 A-B 출력
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a - b);
	}

}
