package UI.layers;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import UI.Layer;

public class WeatherLayer extends Layer{

	public WeatherLayer(String fileName, Dimension size) {
		super(fileName, size);
	}

	@Override
	protected void drawLayer(Graphics g) {
		g.drawImage(
				this.img, 0, 0, 
				this.size.width, 
				this.size.height, 
				this.offsetX, 
				this.offsetY, 
				this.size.width + this.offsetX, 
				this.size.height, 
				null
		);
	}

	@Override
	protected void move() {
		if(this.offsetX < (int)(this.size.width)) {
			this.offsetX++;
		}
		else {
			this.offsetX = 0;
		}
	}

}
