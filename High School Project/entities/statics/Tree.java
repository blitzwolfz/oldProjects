/*
 	Class For My Tree Entity
 	Contains Collision Bounds For My Tree
 	Contains Tree Methods
 */
package dev.jordan.isugame.entities.statics;

import java.awt.Graphics;

import dev.jordan.isugame.Handler;
import dev.jordan.isugame.gfx.Assets;
import dev.jordan.isugame.items.Item;
import dev.jordan.isugame.tiles.Tile;

public class Tree extends StaticEntity
{

	public Tree(Handler handler, float x, float y) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT * 2);
		
		//BOUNDING RECTANGLE FOR COLLISION *Numbers Are Trial And Error Based On What worked Best*
		bounds.x = 20;
		bounds.y = (int) (height / 1.5f);
		bounds.width = width - 40;
		bounds.height = (int) (height - height / 1.5f);
	}

	@Override
	public void tick() 
	{
		
	}
	
	@Override
	public void die() 
	{
		handler.getWorld().getItemManager().addItem(Item.woodItem.createNew((int)x, (int)y));
	}
	
	@Override
	public void render(Graphics g) 
	{
		g.drawImage(Assets.tree, (int) (x-handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height, null);
	}

}
