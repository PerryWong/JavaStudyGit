package homework_java_2_2_2;

/**
 * 
 * @author Perry
 * Desc： 时钟类
 *
 */
public class Java2_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner in = new java.util.Scanner(System.in);

		Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());

		clock.tick();

		System.out.println(clock);

		in.close();
	}

}
