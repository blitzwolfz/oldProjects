/*
 	States Class
 	States Such as Main Menu, Settings, Game etc
 */

package dev.jordan.isugame.states;

import java.awt.Graphics;

import dev.jordan.isugame.Handler;

public abstract class State 
{
	//GameState Manager  - Sets What State to render/tick
	private static State currentState = null;
	public static void setState(State state)
	{
		currentState = state;
	}
	public static State getState()
	{
		return currentState;
	}
	//Classes
	protected Handler handler;
	
	public State(Handler handler)
	{
		this.handler = handler;
	}
	
	public abstract void tick();
	
	public abstract void render(Graphics g);   //Takes Graphics g so We can Draw to Screen
	
	
}
