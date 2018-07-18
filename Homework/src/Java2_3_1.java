import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Perry
 * Desc：计算城市距离
 *
 */
public class Java2_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next(); 
		List<String> cityList = new ArrayList<String>();
		while(!input.equals("###")) {
				cityList.add(input);
				input = scanner.next();
		}
		String[][] cityDistanceArr = new String[cityList.size()][cityList.size()];
		for (int i = 0; i < cityList.size(); i++) { // 行
			for (int j = 0; j < cityList.size(); j++) { // 列
				cityDistanceArr[i][j] = scanner.next();
			}
		}
		String startCity = scanner.next();
		String endCity = scanner.next();
		int indexRow = 0;
		int indexColumn = 0;
		for (int i = 0; i < cityList.size(); i++) { // 行
			if(cityList.get(i).equals(startCity)) {
				indexRow = i;
			}
			if(cityList.get(i).equals(endCity)) {
				indexColumn = i;
			}
		}
		System.out.println(cityDistanceArr[indexRow][indexColumn]);
		scanner.close();
	}

}
