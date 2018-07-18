package cellmachine;

import javax.swing.JFrame;

import cell.Cell;
import field.Field;
import field.View;

public class CellMachine {

	public static void main(String[] args) {
		/* 设置数据 */
		// 创建领域
		Field field = new Field(30,30);
		// 填充cell到网格中
		for ( int row = 0; row<field.getHeight(); row++ ) {
			for ( int col = 0; col<field.getWidth(); col++ ) {
				field.place(row, col, new Cell());
			}
		}
		// 遍历网格获得各个位置cell,随机数小于0.2则复活cell
		// 即设置随机显示一些cell
		for ( int row = 0; row<field.getHeight(); row++ ) {
			for ( int col = 0; col<field.getWidth(); col++ ) {
				Cell cell = field.get(row, col);
				if ( Math.random() < 0.2 ) {
					cell.reborn();
				}
			}
		}
		// 显示面板
		View view = new View(field);
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setTitle("Cells");
		frame.add(view);
		frame.pack();
		frame.setVisible(true);
		// 循环更新面板1000次
		for ( int i=0; i<1000; i++ ) {
			// 获得每一个cell的周围cell存活数量
			for ( int row = 0; row<field.getHeight(); row++ ) {
				for ( int col = 0; col<field.getWidth(); col++ ) {
					Cell cell = field.get(row, col);
					Cell[] neighbour = field.getNeighbour(row, col);
					int numOfLive = 0;
					for ( Cell c : neighbour ) {
						if ( c.isAlive() ) {
							numOfLive++;
						}
					}
					System.out.print("["+row+"]["+col+"]:");
					System.out.print(cell.isAlive()?"live":"dead");
					System.out.print(":"+numOfLive+"-->");
					// 如果细胞存活且周围存活不等于2或3时则死亡
					if ( cell.isAlive() ) {
						if ( numOfLive <2 || numOfLive >3 ) {
							cell.die();
							System.out.print("die");
						}
						// 若存活数等于3时则复活
					} else if ( numOfLive == 3 ) {
						cell.reborn();
						System.out.print("reborn");
					}
					System.out.println();
				}
			}
			System.out.println("UPDATE");
			// 重新绘制面板
			frame.repaint();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
