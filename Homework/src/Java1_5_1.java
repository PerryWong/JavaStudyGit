import java.util.Scanner;

/**
 * @author Perry
 *
 * 分解质因数
 */

public class Java1_5_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		if(input < 2 || input > 100000) {
			System.out.println("请输入一个[2,100000]范围内的整数");
			scanner.close();
			return;
		}
		StringBuffer sb = new StringBuffer();
		int remainder = input;
		int decomposition = 0;
		while(remainder != 1) {
			decomposition = decompositionFactor(remainder);
			if(remainder != input)
				sb.append("x");
			sb.append(String.valueOf(decomposition));
			remainder /= decomposition;
		}
		System.out.println(input + "=" + sb.toString());
		scanner.close();
	}
	
	// 分解质因数
	private static int decompositionFactor(int input) {
		for (int i = 2; i <= input; i++) {
			if(input % i == 0) {
				return i;
			}
		}
		return 1;
	}
}
