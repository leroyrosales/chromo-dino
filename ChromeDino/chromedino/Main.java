
package chromedino;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		int boardWidth = 750;
		int boardHeight = 250;
		
		JFrame frame = new JFrame("Chrome Dino");
		
		frame.setSize(boardWidth, boardHeight);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ChromeDino chromeDino = new ChromeDino();
		frame.add(chromeDino);
		frame.pack();
		chromeDino.requestFocus();
		frame.setVisible(true);
		
	}

}
