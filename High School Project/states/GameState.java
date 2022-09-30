/*
 	Game State Class
 	Where The Game play is going to take place
 */

package dev.jordan.isugame.states;

import java.awt.Graphics;

import dev.jordan.isugame.Game;
import dev.jordan.isugame.Handler;
import dev.jordan.isugame.entities.creatures.Player;
import dev.jordan.isugame.entities.statics.Tree;
import dev.jordan.isugame.gfx.Assets;
import dev.jordan.isugame.worlds.World;

public class GameState extends State 
{
	
	private Player player;
	private World world;

	
	public GameState(Handler handler)
	{
		super(handler);
		world  = new World(handler, "res/worlds/world1.txt");
		handler.setWorld(world);
		
	}
	@Override
	public void tick() 
	{
		world.tick();
		if(handler.getKeyManager().menu)
		{
			State.setState(handler.getGame().menuState);
		}
			
	}
	@Override
	public void render(Graphics g) 
	{
		world.render(g);
	}
}
