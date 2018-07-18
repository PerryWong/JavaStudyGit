import java.util.Scanner;

/**
 * 
 * @author Perry
 * Desc：将华氏温度转换成摄氏温度的程序
 * 转换公式：°F = (9/5)*°C + 32
 *
 */
public class Java1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int f = 0;
		f = scanner.nextInt();
		scanner.close();
		System.out.println((int)((f-32)/(9.0/5))+"");
	}

}
