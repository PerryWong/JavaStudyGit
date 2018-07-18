import java.util.Scanner;

/**
 * 
 * @author Perry
 * Desc：读数字
 *
 */
public class Java1_3_4 {
	
	private static String[] arrString =new String[] {
		"ling","yi","er","san","si","wu","liu","qi","ba","jiu"
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int current = 0;
		StringBuffer sb = new StringBuffer();
		sb.append("");
		if(input >= -100000 && input <= 100000) {
			if(input == 0) {
				System.out.println(readNumber(input));
				scanner.close();
				return;
			}
			current = input;
			while(current != 0) {
				if(current == input) {
					sb.insert(0,readNumber(getUnitsDigit(current)));
				}else{
					sb.insert(0,readNumber(getUnitsDigit(current))+" ");
				}
				if(current < 0 && current > -10) {
					if(current < 0) {
						sb.insert(0,"fu ");
					}
				}
				current /= 10;
			}
			System.out.println(sb.toString());
		}else{
			System.out.println("输入整数范围是[-100000,100000]");		
		}
		scanner.close();
	}
	
	private static int getUnitsDigit(int number) {
		return number % 10;
	}
	
	private static String readNumber(int number) {
//		if(number >= 0) {
			return arrString[Math.abs(number)];
//		}else {
//			return "fu " + arrString[Math.abs(number)];
//		}
	}
}
