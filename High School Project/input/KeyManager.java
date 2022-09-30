/*
	Key Manager
	Manages All User Inputs
 */
package dev.jordan.isugame.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import dev.jordan.isugame.Launcher;
import dev.jordan.isugame.states.State;

public class KeyManager implements KeyListener
{
	private boolean[] keys;
	public boolean up, down, left, right;
	public boolean menu;
	public boolean aUp, aDown,aLeft, aRight;		//Attack Direction Variables
	
	
	public void tick()
	{
		menu = keys[KeyEvent.VK_ESCAPE];
		//Move
		up = keys[KeyEvent.VK_W]; 
		down = keys[KeyEvent.VK_S];
		left = keys[KeyEvent.VK_A];
		right = keys[KeyEvent.VK_D];
		//Attack
		aUp = keys[KeyEvent.VK_UP]; 
		aDown = keys[KeyEvent.VK_DOWN];
		aLeft = keys[KeyEvent.VK_LEFT];
		aRight = keys[KeyEvent.VK_RIGHT];
	}
	
	public KeyManager()
	{
		keys = new boolean[256];
	}

	@Override
	public void keyPressed(KeyEvent e) 
	{
		keys[e.getKeyCode()] = true;
	}

	@Override
	public void keyReleased(KeyEvent e) 
	{
		keys[e.getKeyCode()] = false;
	}

	@Override
	public void keyTyped(KeyEvent e) 
	{
		
	}
	
}
