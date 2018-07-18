import java.util.Scanner;

/**
 * 
 * @author Perry
 * Desc：第n个到第m个质数和
 *
 */
public class Java1_3_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		int currentPrimeIndex = 1;
		int currentValue = 1;
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int max = m > n ? m : n;
		int min = m < n ? m : n;
		while(currentPrimeIndex <= max) {
			if(testIsPrime(currentValue)) {
				if(min <= currentPrimeIndex) {
					result += currentValue;
				}
				currentPrimeIndex++;
			}
			currentValue++;
		}
		scanner.close();
		System.out.println(String.valueOf(result));
	}
	
	/**
	 * 判断自然数是否为质数
	 * 
	 * @param value 被判断自然数
	 * @return 是否为质数
	 */
	private static boolean testIsPrime(int value) {
		if(value < 4) {
			return value > 1;
		}
		for (int i = 2; i <= Math.sqrt(value); i++) {
			if(value % i == 0) {
				return false;
			}
		}
		return true;
	}
}
