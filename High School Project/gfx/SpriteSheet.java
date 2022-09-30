/*
	This is going to Store a Buffered Image
	It will determine where on sprite sheet to use for image
 */
package dev.jordan.isugame.gfx;

import java.awt.image.BufferedImage;

public class SpriteSheet 
{
	private BufferedImage sheet;

	
	public SpriteSheet(BufferedImage sheet)
	{
		this.sheet = sheet;
	}
	
	//Method That is going to Crop The Image
	public BufferedImage crop(int x, int y, int width, int height)
	{
		return sheet.getSubimage(x, y, width, height);
	}
}
