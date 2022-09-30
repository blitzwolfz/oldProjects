/*
 	World Class
 	Needs Width, Height
 	Needs MultiDimensional Array To Store Blocks in Position
 	Needs Tick and Render Method
 */
package dev.jordan.isugame.worlds;

import java.awt.Graphics;

import dev.jordan.isugame.Handler;
import dev.jordan.isugame.entities.EntityManager;
import dev.jordan.isugame.entities.creatures.Player;
import dev.jordan.isugame.entities.statics.Tree;
import dev.jordan.isugame.items.ItemManager;
import dev.jordan.isugame.tiles.Tile;
import dev.jordan.isugame.utils.Utils;

public class World
{
	private Handler handler;
	private int width, height;
	private int spawnX, spawnY;
	private int[][] tiles;
	
	//ENTITIES
	private EntityManager entityManager;
	//ITEM
	private ItemManager itemManager;
	
	public World(Handler handler, String path)
	{
		this.handler = handler;
		entityManager = new EntityManager(handler, new Player(handler, 100, 100));
		itemManager = new ItemManager(handler);
		//LOAD ENTITY
		entityManager.addEntity(new Tree(handler, 164, 100));
		loadWorld(path);
		
		entityManager.getPlayer().setX(spawnX);
		entityManager.getPlayer().setY(spawnY);
	}
	//Getter and Setter For Entity Manager
	public EntityManager getEntityManager() 
	{
		return entityManager;
	}

	public void tick()
	{
		itemManager.tick();
		entityManager.tick();
	}
	
	public void render(Graphics g)
	{
		//FIRST AND LAST BLOCK RENDER FOR BETTER LOADING EFFICIENCY
		
		//Math.max gives highest of the two numbers so if it is a negative number it will default to 0
		int xStart = (int) Math.max(0, handler.getGameCamera().getxOffset() / Tile.TILEWIDTH );	//If you add 1 to end, you can see blocks disappear
		int xEnd = (int) Math.min(width, (handler.getGameCamera().getxOffset() +handler.getWidth()) / Tile.TILEWIDTH + 1); //Add 1 to render Outside blocks
		int yStart = (int) Math.max(0, handler.getGameCamera().getyOffset() / Tile.TILEHEIGHT);
		int yEnd = (int) Math.min(width, (handler.getGameCamera().getyOffset() +handler.getHeight()) /Tile.TILEHEIGHT + 1);
		
		for(int y = yStart; y < yEnd;y++)
		{
			for(int x = xStart; x < xEnd;x++)
			{
				getTile(x, y).render(g, (int) (x * Tile.TILEWIDTH - handler.getGameCamera().getxOffset()), 
						(int) (y * Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()));
			}
		}
	//ITEMS
	itemManager.render(g);
	//ENTITIES
	entityManager.render(g);
	}
	public Handler getHandler() 
	{
		return handler;
	}
	public void setHandler(Handler handler) 
	{
		this.handler = handler;
	}
	public ItemManager getItemManager() 
	{
		return itemManager;
	}
	public void setItemManager(ItemManager itemManager) 
	{
		this.itemManager = itemManager;
	}
	public Tile getTile(int x, int y)
	{
		//If Player Somehow Gets Outside of map Return as Walkable Block to Avoid Crash and errors
		if(x < 0 || y < 0 || x >= width || y >= height)
			return Tile.grassTile;
		
		
		Tile t = Tile.tiles[tiles[x][y]];
		if(t == null)
			return Tile.dirtTile;
		return t;
	}
	private void loadWorld(String path)
	{
		String file = Utils.loadFileAsString(path);
		String[] tokens = file.split("\\s+"); 
		width = Utils.parseInt(tokens[0]);
		height = Utils.parseInt(tokens[1]);
		spawnX = Utils.parseInt(tokens[2]);
		spawnY = Utils.parseInt(tokens[3]);
		
		tiles = new int[width][height];
		for(int y =  0;y < height;y++)
		{
			for(int x = 0;x < width;x++)
			{
				tiles[x][y] = Utils.parseInt(tokens[(x + y *width + 4)]); //Add 4 Because we set 4 that aren't WorldData
			}
		}
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
}
