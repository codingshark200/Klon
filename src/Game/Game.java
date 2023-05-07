package Game;

import UI.GamePanel;
import UI.GameWindow;
import audio.JukeBox;

public class Game {
	
	private GameWindow window;
	private GamePanel gamePanel;
	private JukeBox juke;
	
	public Game() {
		this.gamePanel = new GamePanel(GameSettings.size);
		this.window = new GameWindow("Title", this.gamePanel);
		this.window.setVisible(true);
		this.juke = new JukeBox();
	}

	public void drawGame() {
		
		gamePanel.repaint();
	}
	
	
	public void nextStep() {
		drawGame();
	}

	public void playSound(String fileName) {
		this.juke.play(fileName);
		
	}
}
