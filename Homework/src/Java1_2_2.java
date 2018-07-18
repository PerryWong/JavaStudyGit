import java.util.Scanner;

public class Java1_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String description = "";
		int RS = 0;
		RS = scanner.nextInt();
		// 可读性,易读
		int Readability = 0;
		// 力量；力气；兵力；长处
		int Strength = 0;
		if(RS > 10 && RS < 60) {
			if(RS - 50 > 0) {
				Readability = 5;
				Strength = RS - 50;
			}else if(RS - 40 > 0) {
				Readability = 4;
				Strength = RS - 40;
			}else if(RS - 30 > 0) {
				Readability = 3;
				Strength = RS - 30;
			}else if(RS - 20 > 0) {
				Readability = 2;
				Strength = RS - 20;
			}else if(RS - 10 > 0) {
				Readability = 1;
				Strength = RS - 10;
			}
			switch(Strength) {
				case 1:
					// 模糊的信号,勉强可接收
					description = "Faint signals, barely perceptible"+", ";
					break;
				case 2:
					// 十分虚弱的信号
					description = "Very weak signals"+", ";
					break;
				case 3:
					// 虚弱的信号
					description = "Weak signals"+", ";
					break;
				case 4:
					// 清楚的信号
					description = "Fair signals"+", ";
					break;
				case 5:
					// 相当不错的信号
					description = "Fairly good signals"+", ";
					break;
				case 6:
					// 优良的信号
					description = "Good signals"+", ";
					break;
				case 7:
					// 中强信号
					description = "Moderately strong signals"+", ";
					break;
				case 8:
					// 强信号
					description = "Strong signals"+", ";
					break;
				case 9:
					// 极强的信号
					description = "Extremely strong signals"+", ";
					break;
				default:
					break;
			}
			switch(Readability) {
			case 1:
				// 不值一读的；难以辨认的；难以理解的
				description += "unreadable"+".";
				break;
			case 2:
				// 勉强可读,偶尔能辨识的词
				description += "barely readable, occasional words distinguishable"+".";
				break;
			case 3:
				// 伴随着巨大困难的可读
				description += "readable with considerable difficulty"+".";
				break;
			case 4:
				// 几乎没有困难的可读
				description += "readable with practically no difficulty"+".";
				break;
			case 5:
				// 完美可读
				description += "perfectly readable"+".";
				break;
			default:
				break;
		}
		}
		scanner.close();
		System.out.println(description);
	}

}
