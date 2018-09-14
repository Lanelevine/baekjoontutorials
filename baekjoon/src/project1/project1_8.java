package project1;
 // Tip : Arraylist 함수와 Scanner 함수를 같이 써주도록 하자.
import java.util.ArrayList;
import java.util.Scanner;
public class project1_8 {

	public static void main(String[] args) {
		/* 이 문제는 project1_7과 입력하는 것이 같음
		 * 문제 : 입력 받은 대로 출력하는 프로그램을 작성하시오.
		 * 입력 : 입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 잇다.
		 * 		각 줄은 100글자를 넘지 않으며, 빈 줄이 주어질 수도 있고, 각 줄의 앞 뒤에 공백이 있을 수도 있다.
		 * 출력 : 입력받은 그대로 출력한다. 
		 */
		Scanner sc= new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
         
        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            if (input == null || input.isEmpty()) {
                break;
            }
            inputs.add(input);
        }
        sc.close();
 
        for (int i = 0; i < inputs.size(); ++i) {
            System.out.println(inputs.get(i));
        }
	}

}
