import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import game.GameBoard;

public class ApplicationWindow extends JFrame {

	public ApplicationWindow() {
		
		JPanel panelPlaceholder = new JPanel();
		panelPlaceholder.setLayout(new GridLayout());

		GameBoard gameBoard = new GameBoard();
		panelPlaceholder.add(gameBoard);
		
		this.add(panelPlaceholder);
		this.setVisible(true);
		this.setSize(660, 680);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}