package UI.layers;

import java.awt.Dimension;
import java.awt.Graphics;

import UI.Layer;

public class MonsterLayer extends Layer {
	
	private short cnt;
	
	public MonsterLayer(String fileName, Dimension size) {
		super(fileName, size);
	}

	@Override
	protected void drawLayer(Graphics g) {
		g.drawImage(
				img,
				0,
				0,
				this.size.width,
				this.size.height,
				0,
				this.size.height + offsetY,
				this.size.width,
				this.img.getHeight() + 2000 + offsetY,
				null
		);
	}

	@Override
	protected void move() {
		if(this.offsetY < img.getHeight() - this.size.height ) {
			cnt--;
			if(cnt % 2 == 0) {
				this.offsetY--;
			}
		}
	}

}
