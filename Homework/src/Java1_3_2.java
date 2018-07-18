import java.util.Scanner;

public class Java1_3_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// 当前位置
		int currentIndex = 1;
		// 余数
		int remainder = 0;
		//  结果
		int result = 0;
		// 用户输入
		int input = scanner.nextInt();
		// 当前值
		int current = 0;
		if(input > 0 && input < 100000) {
			current = input;
			// 循环对10取余获得末位数，且取余后除以10减少位数
			while(current > 0) {
				// 获得当前余数
				remainder = current % 10;
				if(remainder > 0)
				// 判断奇偶
				if(remainder % 2 == 0) {
					// 当前位置为偶数
					if((currentIndex % 2) == 0){
						result += Math.pow(2, currentIndex-1);
					}
				}else{
					// 当前位置为奇数		
					if((currentIndex % 2) != 0){
						result += Math.pow(2, currentIndex-1);
					}
				}
				
				current = current / 10;
				currentIndex ++;
			}
			System.out.println(String.valueOf(result));
		}else if(input == 0 || input == 100000){
			System.out.println("0");
		}else{
			System.out.println("请输入非负整数，范围是[0,100000]");
		}
		scanner.close();
	}
}
