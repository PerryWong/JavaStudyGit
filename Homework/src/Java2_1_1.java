import java.util.Scanner;

/**
 * 
 * @author Perry
 * Desc：你的程序要读入一行文本，其中以空格分隔为若干个单词，以‘.’结束。
 * 你要输出这行文本中每个单词的长度。这里的单词与语言无关，可以包括各种符号，
 * 比如“it's”算一个单词，长度为4。
 * 注意，行中可能出现连续的空格。
 *
 */
public class Java2_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String inputText = scanner.nextLine();
		int index = inputText.indexOf(".");
		String result = inputText.substring(0,index);
		String[] texts = result.split(" ");
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < texts.length; i++) {
			int length = texts[i].trim().toString().length();
			if(length != 0) {
				if(sb.length() == 0)
					sb.append(String.valueOf(length));
				else
					sb.append(" " + String.valueOf(length));
			}
		}
		System.out.println(sb.toString());
		scanner.close();
	}
}
