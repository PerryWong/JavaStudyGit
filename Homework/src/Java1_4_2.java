import java.util.Scanner;

/**
 * 
 * @author Perry
 * Desc：井字棋
 *
 */
public class Java1_4_2 {
	
	public static final int O_Win = 0;
	public static final int X_Win = 1;
	public static final int NIL = 2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean OWin = false;
		boolean XWin = false;
		int inputSize = scanner.nextInt();
		int[][] chessboardArr = new int[inputSize][inputSize];
		int rowO = 0;
		int rowX = 0;
		int columnO = 0;
		int columnX = 0;
		int diagonalO = 0;
		int diagonalX = 0;
		int backDiagonalO = 0;
		int backDiagonalX = 0;
		for (int i = 0; i < inputSize; i++) { // 行
			for (int j = 0; j < inputSize; j++) { // 列
				chessboardArr[i][j] = scanner.nextInt();
			}
		}
		for (int i = 0; i < inputSize; i++) { // 行
			rowO = 0;
			rowX = 0;
			columnO = 0;
			columnX = 0;
			for (int j = 0; j < inputSize; j++) { // 列
				// 判断行
				switch (chessboardArr[i][j]) {
					case O_Win:
						rowO++;
						break;
					case X_Win:
						rowX++;
						break;
				}
				// 判断列
				switch (chessboardArr[j][i]) {
					case O_Win:
						columnO++;
						break;
					case X_Win:
						columnX++;
						break;
				}
				// 判断对角线
				if(i == j) {
					switch (chessboardArr[i][j]) {
						case O_Win:
							diagonalO++;
							break;
						case X_Win:
							diagonalX++;
							break;
					}
				}
				// 判断反对角线
				if(i + j == inputSize - 1) {
					switch (chessboardArr[i][j]) {
					case O_Win:
						backDiagonalO++;
						break;
					case X_Win:
						backDiagonalX++;
						break;
				}
				}
				
			}
			if(rowO == inputSize || columnO == inputSize) {
				OWin = true;
			}
			if (rowX == inputSize || columnX == inputSize) {
				XWin = true;
			}
		}
		if(diagonalO == inputSize || backDiagonalO == inputSize) {
			OWin = true;
		}
		if (diagonalX == inputSize || backDiagonalX == inputSize) {
			XWin = true;
		}
		if(OWin == XWin) {
			System.out.println("NIL");
		}else {
			if(OWin) {
				System.out.println("O");
			}else if(XWin){
				System.out.println("X"); 
			}
//			String print = OWin ? "O" : "X";
//			System.out.println(print);
		}
		scanner.close();
	}

}
