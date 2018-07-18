import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author Perry
 * Desc：完数
 * 一个正整数的因子是所有可以整除它的正整数。
 * 而一个数如果恰好等于除它本身外的因子之和，这个数就称为完数。
 * 例如6=1＋2＋3(6的因子是1,2,3)。
 * 
 */
public class Java1_5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int inputStart = scanner.nextInt();
		int inputEnd = scanner.nextInt();
		if(inputStart < 1 || inputStart > 1000) {
			System.out.println("请输入[1,1000]范围内的整数");
			scanner.close();
			return;
		}
		if(inputEnd < 1 || inputEnd > 1000) {
			System.out.println("请输入[1,1000]范围内的整数");
			scanner.close();
			return;
		}
		List<Integer> perfectNumberList = new ArrayList<Integer>(); 
		for (int i = inputStart; i <= inputEnd; i++) {
			if(isPerfectNumber(i)) {
				perfectNumberList.add(i);
			}
		}
		if(perfectNumberList.size() > 0) {
			if(perfectNumberList.size() == 1) {
				System.out.println(String.valueOf(perfectNumberList.get(0)));
			}else {
				StringBuffer sb = new StringBuffer();
				for (int i = 0; i < perfectNumberList.size(); i++) {
					if(i != perfectNumberList.size() - 1)
						sb.append(String.valueOf(perfectNumberList.get(i))+" ");
					else
						sb.append(String.valueOf(perfectNumberList.get(i)));
				}
				System.out.println(sb.toString());
			}
		}else {
			System.out.println("NIL");
		}
		scanner.close();
	}
	
	public static boolean isPerfectNumber(int number) {
		if(number == 1) {
			return false;
		}
		int sum = 1;
		for (int i = 2; i < number; i++) {
			if(number % i == 0) {
				sum += i;
			}
		}
		return sum == number;
	}
}
