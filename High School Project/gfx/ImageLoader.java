package dev.jordan.isugame.gfx;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

//This Class Loads Images
public class ImageLoader 
{
	public static BufferedImage loadImage(String path)
	{
		try 
		{
			return ImageIO.read(ImageLoader.class.getResource(path));
		} catch (IOException e) 
		
		{
			e.printStackTrace();
			System.exit(1);
		}
		return null;
	}
}
