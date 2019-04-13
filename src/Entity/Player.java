package Entity;

import java.awt.Color;
import java.awt.Graphics;

import java.awt.Graphics;

import Mario.Game;
import Mario.Handler;
import Mario.Id;
import Tile.Tile;

public class Player extends Entity {

	public Player(int x, int y, int width, int height, boolean solid, Id id, Handler handler) {
		super(x, y, width, height, solid, id, handler);
	}


	public void render(Graphics g) {

		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);
	}


	public void tick() {

		x += velX;
		y += velY;
		if( x<=0 ) x = 0;
		if( y<=0 ) y = 0;
		if( x+width >= 1080) x = 1080-width;
		if( y+height >= 771) y = 1080-height;
	}

}
