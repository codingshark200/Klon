package UI.layers;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import UI.Layer;

public class TextLayer extends Layer{

	private int cnt = 0;
	Font  f1  = new Font("Flubber", Font.BOLD,  50);
	
	private String[] text = {
			"Es war einmal vor langer Zeit...",
			"Da lebten die Drachen!!!!!!!!",
			"Sie waren groß und gefährlich",
			"Und Sie töteten jeden der sich Ihnen näherte",
			"Doch dann kam der Superhero!!!"
	};
	
	private int currentTextIndex = 0;
	
	public TextLayer(String[] text, Dimension size) {
		super(null, size);
	}

	@Override
	protected void drawLayer(Graphics g) {
		int fontLength = g.getFontMetrics().stringWidth(text[currentTextIndex]);
		g.setFont(f1);
		g.drawString(
				text[currentTextIndex],
				this.size.width / 2 - fontLength * 2, 
				this.size.height / 2
		);
		
	}

	@Override
	protected void move() {
		if(cnt++ % (3 * 120) == 0) {
			currentTextIndex++;
			if(currentTextIndex >= text.length) {
				currentTextIndex--;
			}
		}
	}

}
