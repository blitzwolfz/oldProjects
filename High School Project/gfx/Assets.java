/*
 	Code for Images, Sounds, Music
 	Creates 
 */

package dev.jordan.isugame.gfx;

import java.awt.image.BufferedImage;

public class Assets 
{
	private static final int width = 32, height = 32;
	
	public static BufferedImage dirt, grass, rock, stone;	//Blocks
	public static BufferedImage tree;		//Entities
	public static BufferedImage[] player_down, player_up, player_left, player_right;	//Animations
	public static BufferedImage[] btn_start; 		//Buttons
	public static BufferedImage wood;		//Items
	
	
	public static void init()
	{
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/SpriteSheet.png"));
		
		btn_start = new BufferedImage[2];
		btn_start[0] = sheet.crop(0, height*5, width*2, height);
		btn_start[1] = sheet.crop(0, height*6, width*2, height);
		
		player_down = new BufferedImage[2];
		player_up = new BufferedImage[2];
		player_left = new BufferedImage[2];
		player_right = new BufferedImage[2];
		
		//Walking Animations
		player_down[0] = sheet.crop(0, width, width, height);
		player_down[1] = sheet.crop(width, width, width, height);
		
		player_up[0] = sheet.crop(width * 2, width, width, height);
		player_up[1] = sheet.crop(width * 3, width, width, height);
		
		player_left[0] = sheet.crop(width * 4, width, width, height);
		player_left[1] = sheet.crop(width * 5, width, width, height);
		
		player_right[0] = sheet.crop(width * 6, width, width, height);
		player_right[1] = sheet.crop(width * 7, width, width, height);
		
		//Items
		wood = sheet.crop(width, height*2, width, height);
		
		//Blocks
		dirt = sheet.crop(0, 0, width, height);
		grass = sheet.crop(width, 0, width, height);
		rock = sheet.crop(2*width, 0, width, height);
		stone = sheet.crop(3*width, 0, width, height);
		//Entities
		tree = sheet.crop(0, height*2, width, height*2);
		
		
	}

}
