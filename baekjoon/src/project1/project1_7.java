package project1;

// Tip!! : ArrayList �Լ��� ��ĳ�� �Լ��� ���� ������
import java.util.ArrayList;
import java.util.Scanner;

public class project1_7 {

	public static void main(String[] args) {
		/* ��� �˰���
		 * ���� : �Է� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * �Է� : �Է��� �־�����. �Է��� �ִ� 100�ٷ� �̷���� �ְ�, ���ĺ� �ҹ���, �빮��, ����, ���ڷθ� �̷���� �ִ�.
		 *  	�� ���� 100���ڸ� ���� ������, �� ���� �־����� �ʴ´�. ��, �� ���� �������� �������� �ʰ�, �������� ������ �ʴ´�.
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
