import java.util.Scanner;

/**
 * 
 * @author Perry
 * Desc：UTC是世界协调时，BJT是北京时间
 *
 */
public class Java1_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int BJT = 0;
		BJT = scanner.nextInt();
		int UTC = 0;
		if(BJT < 800) {
			UTC = 2400 - 800 +BJT;
		}else {
			UTC = BJT - 800;
		}
		scanner.close();
		System.out.println(UTC+"");
	}

}
