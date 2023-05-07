package UI;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public abstract class Layer {

	protected int offsetX, offsetY;
	protected BufferedImage img;
	protected Dimension size;
	
	protected Layer(String fileName, Dimension size) {
		try {
			if(fileName != null)
				this.img = ImageIO.read(new File(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.size = size;
	}

	protected abstract void drawLayer(Graphics g);
	
	protected abstract void move();
}
