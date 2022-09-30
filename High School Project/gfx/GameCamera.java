/*
 	Game Camera
 	The "Camera" Is what The screen can see
 	Moves around as the player moves around
 */

package dev.jordan.isugame.gfx;

import dev.jordan.isugame.Handler;
import dev.jordan.isugame.entities.Entity;
import dev.jordan.isugame.tiles.Tile;

public class GameCamera 
{
	private Handler handler;
	private float xOffset, yOffset;
	
	public GameCamera(Handler handler, float xOffset, float yOffset)
	{
		this.handler = handler;
		this.xOffset = xOffset;
		this.yOffset = yOffset;
	}
	//Checking For if there is any White Space Shown So that it Doesn't Look ugly
	public void checkBlankSpace()
	{
		//Checks if Blank Space is Shown (xOffset < 0, And sets it to 0 if it is)
		if(xOffset < 0)
		{
			xOffset = 0;
		}
		else if(xOffset > handler.getWorld().getWidth() * Tile.TILEWIDTH - handler.getWidth())
		{
			xOffset = handler.getWorld().getWidth() * Tile.TILEWIDTH - handler.getWidth();
		}
		
		if(yOffset < 0)
		{
			yOffset = 0;
		}
		else if(yOffset > handler.getWorld().getHeight() * Tile.TILEHEIGHT - handler.getHeight())
		{
			yOffset = handler.getWorld().getHeight() * Tile.TILEHEIGHT - handler.getHeight();
		}
	}
	
	public void centerOnEntity(Entity e)
	{
		xOffset = e.getX() - handler.getWidth() / 2 + e.getWidth() /2; 		//Divide by Two so in center not on edge
		yOffset = e.getY() - handler.getHeight() / 2 + e.getHeight() /2;
		checkBlankSpace();
	}
	
	public void move(float xAmt, float yAmt)
	{
		xOffset += xAmt; 
		yOffset += yAmt;
		checkBlankSpace();
	}
	
	//GETTERS AND SETTERS
	public float getxOffset() 
	{
		return xOffset;
	}

	public void setxOffset(float xOffset) 
	{
		this.xOffset = xOffset;
	}

	public float getyOffset() 
	{
		return yOffset;
	}

	public void setyOffset(float yOffset) 
	{
		this.yOffset = yOffset;
	}

	
}
