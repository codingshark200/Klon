package Game;

public class Program {
	
	
	public static void main(String[] args) {
		Game game = new Game();
		game.playSound("src/res/sound/dragon.wav");
		while(GameSettings.runGame) {
			game.nextStep();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
