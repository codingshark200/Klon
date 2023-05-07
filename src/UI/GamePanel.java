package UI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import UI.layers.BgLayer;
import UI.layers.MonsterLayer;
import UI.layers.TextLayer;
import UI.layers.WeatherLayer;

public class GamePanel extends JPanel{

	private Layer[] layers;
	
	public GamePanel(Dimension size) {
		this.setSize(size);
		this.setBackground(Color.BLUE);
		this.layers = new Layer[] {
				new BgLayer("src/res/img/bg/bg1.png", size),
				new MonsterLayer("src/res/img/monster/dragon.png", size),
				new WeatherLayer("src/res/img/weather/fog.png", size),
				new TextLayer(null, size)
		};
	}
	

	@Override
	public void paint(Graphics g) {
		paintComponent(g);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.clearRect(0, 0, this.getSize().width, this.getSize().height);
		for(Layer l : this.layers) {
			l.move();
			l.drawLayer(g);
		}

	}
	
	
}
