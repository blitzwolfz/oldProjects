package dev.jordan.isugame.states;

import java.awt.Graphics;

import dev.jordan.isugame.Handler;

public class SettingsState extends State
{
	
	public SettingsState(Handler handler)
	{
		super(handler);
	}
	@Override
	public void tick() 
	{
		if(handler.getKeyManager().menu)
			State.setState(handler.getGame().menuState);
	}
	@Override
	
	public void render(Graphics g) 
	{
		
	}
	
}
