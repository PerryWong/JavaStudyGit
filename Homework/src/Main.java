import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		System.out.println(""+(input%2));
		scanner.close();
	}
	/*String s1 = "hello";
    String s2 = "hello";
    System.out.println(s1 == s2);
    输出 true 此处应该是s1与s2字符串相同从而指向同一地址 故s1，s2对象为同一对象*/
}
