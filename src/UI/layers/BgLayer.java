package UI.layers;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import UI.Layer;

public class BgLayer extends Layer{

	public BgLayer(String fileName, Dimension size) {
		super(fileName, size);
	}

	@Override
	protected void drawLayer(Graphics g) {
		g.drawImage(this.img, 0, 0, this.size.width, this.size.height, null);
	}

	@Override
	protected void move() {
		
	}

}
