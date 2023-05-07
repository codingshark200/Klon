package UI;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class GameWindow extends JFrame{

	
	public GameWindow(String title, GamePanel gamePanel) {
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setContentPane(gamePanel);
	}
	
}
