package project1;
 // Tip : Arraylist �Լ��� Scanner �Լ��� ���� ���ֵ��� ����.
import java.util.ArrayList;
import java.util.Scanner;
public class project1_8 {

	public static void main(String[] args) {
		/* �� ������ project1_7�� �Է��ϴ� ���� ����
		 * ���� : �Է� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * �Է� : �Է��� �־�����. �Է��� �ִ� 100�ٷ� �̷���� �ְ�, ���ĺ� �ҹ���, �빮��, ����, ���ڷθ� �̷���� �մ�.
		 * 		�� ���� 100���ڸ� ���� ������, �� ���� �־��� ���� �ְ�, �� ���� �� �ڿ� ������ ���� ���� �ִ�.
		 * ��� : �Է¹��� �״�� ����Ѵ�. 
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
