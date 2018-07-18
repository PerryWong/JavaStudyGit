import java.util.Scanner;

public class Java1_4_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 初始化二维数组
		int[][] arrInt = new int[101][2];
		for(int i = 0 ; i < 101 ; i++) {
			for(int j = 0 ; j < 2 ; j++) {
				if(j == 0) {
					arrInt[i][j] = i;
				}else {
					arrInt[i][j] = 0;
				}
			}
		}
		Scanner scanner = new Scanner(System.in);
		int inputPower = 0;
		int coefficient = 0;
		boolean isFirst = true;
		PRINT: while(true) {
			inputPower = scanner.nextInt();
			coefficient = scanner.nextInt();
			if(inputPower <= 100 && inputPower >= 0)
				arrInt[inputPower][1] += coefficient;
			if(inputPower == 0) {
				StringBuffer sb = new StringBuffer();
				// 当幂数为0时跳出
				for(int i = 100 ; i > -1 ; i--) {
					if(arrInt[i][1] != 0) {
						if(sb == null || sb.length() == 0) {
							sb.append(getIntString(i,arrInt[i][1],true));
						}else {
							sb.append(getIntString(i,arrInt[i][1],false));
						}
					}else if(i==0 && arrInt[i][1] == 0){
						if(sb == null || sb.length() == 0) {
							sb.append("0");
						}else {
							sb.append("+0");
						}
					}
				}
				if(isFirst) {
					isFirst = false;
					continue PRINT;
				}else {
					System.out.println(sb.toString());
					scanner.close();
					break;
				}
			
			}
		}
	}
	
	private static String getIntString(int power,int coefficient,boolean isFirst) {
		if(coefficient < 0) {
			if(power == 0) {
				return String.valueOf(coefficient);
			}else if (power == 1){
				if(coefficient == -1) 
					return "-x";
				else
					return coefficient + "x";
			}else {
				if(coefficient == -1) 
					return "-x" + power;
				else
					return coefficient + "x" + power;
			}
		}else {
			if(power == 0) {
				if(isFirst)
					return String.valueOf(coefficient);
				else
					return "+" + String.valueOf(coefficient);
			}else if (power == 1){
				if(isFirst) {
					if(coefficient == 1) 
						return "x";
					else
						return coefficient +"x";
				}else {
					if(coefficient == 1) 
						return "+x";
					else
						return "+" + coefficient + "x";
				}
			}else {
				if(isFirst) {
					if(coefficient == 1) 
						return "x"+power;
					else
						return coefficient+"x"+power;
				}else {
					if(coefficient == 1) 
						return "+x"+power;
					else
						return "+" + coefficient+"x"+power;
				}
			}
		}
	}

}

