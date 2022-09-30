package dev.jordan.isugame.states;

import java.awt.Graphics;

import dev.jordan.isugame.Handler;
import dev.jordan.isugame.gfx.Assets;
import dev.jordan.isugame.ui.ClickListener;
import dev.jordan.isugame.ui.UIImageButton;
import dev.jordan.isugame.ui.UIManager;

public class MenuState extends State 
{
	private UIManager uiManager;
	
	public MenuState(Handler handler)
	{
		super(handler);
		uiManager = new UIManager(handler);
		handler.getMouseManager().setUIManager(uiManager);
		
		uiManager.addObject(new UIImageButton(550, 320, 128, 64, Assets.btn_start, new ClickListener() 
		{

			@Override
			public void onClick() 
			{
				handler.getMouseManager().setUIManager(null);
				State.setState(handler.getGame().gameState);
			}
		}));
	}

	@Override
	public void tick() 
	{	
		uiManager.tick();
	}

	@Override
	public void render(Graphics g)
	{
		uiManager.render(g);
	}

}
