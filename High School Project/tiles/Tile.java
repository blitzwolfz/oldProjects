/*
 	Tiles Class
 	This is What Every Tile Needs
 */

package dev.jordan.isugame.tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import dev.jordan.isugame.states.MenuState;

public class Tile 
{
	//STATIC VARIABLES
	public static Tile[] tiles = new Tile[256]; 		//Tile array to hold tiles
	public static Tile grassTile = new GrassTile(0);	//Setting GrassID To 0
	public static Tile dirtTile = new DirtTile(1); 		//Setting DirtID to 1
	public static Tile rockTile = new RockTile(2);		//Rock ID = 2
	public static Tile stoneTile = new StoneTile(3);	//StoneID = 3
			
	//CLASS
	
	public static final int TILEWIDTH = 64, TILEHEIGHT = 64;
	
	protected BufferedImage texture;
	protected final int id;
	
	public Tile(BufferedImage texture, int id)
	{
		this.texture = texture;
		this.id = id;
		tiles[id] = this;
	}
	public void tick()
	{
		
	}
	public void render(Graphics g, int x, int y)
	{
		g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);
	}
	public boolean isSolid()	//Walkable Block
	{
		return false;
	}
	public int getId()
	{
		return id;
	}
}
