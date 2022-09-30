/*
 	Extends Creature Method
 	Requires Texture and Input
 */
package dev.jordan.isugame.entities.creatures;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import dev.jordan.isugame.Handler;
import dev.jordan.isugame.entities.Entity;
import dev.jordan.isugame.gfx.Animation;
import dev.jordan.isugame.gfx.Assets;

public class Player extends Creature
{
	//ANIMATIONS
	private Animation animDown, animUp, animLeft, animRight;
	//Attack Timer
	private long lastAttackTimer, attackCooldown = 400 , attackTimer = attackCooldown;
	
	public Player(Handler handler, float x, float y)
	{
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);

		/*
			SETTING BOUNDING RECTANGLE FOR COLLISION
		 	Numbers Are Based On Size of My Character, I had to experiment Different Sizes to fit Properly
		 	I Drew A Rectangle Non Filled, Around Based on These Numbers and changed them to Fit where I wanted the collision to Work
		 */
		bounds.x = 24;
		bounds.y = 40;
		bounds.width = 32;
		bounds.height = 37;
		
		//ANIMATIONS INITIALIZATIONS
		animDown = new Animation(500, Assets.player_down);
		animUp = new Animation(500, Assets.player_up);
		animLeft = new Animation(500, Assets.player_left);
		animRight = new Animation(500, Assets.player_right);
	}

	@Override
	public void tick() 
	{
		//Animation
		animDown.tick();
		animUp.tick();
		animLeft.tick();
		animRight.tick();
		//Movement
		getInput();
		move();
		handler.getGameCamera().centerOnEntity(this);
		//Attack
		checkAttacks();
	}
	
	private void checkAttacks()
	{
		//Timer Updater
		attackTimer += System.currentTimeMillis() - lastAttackTimer;
		lastAttackTimer = System.currentTimeMillis();
		if(attackTimer < attackCooldown)
			return;
		
		//cb = Collision Bounds
		Rectangle cb = getCollisionBounds(0, 0);
		//ar = Attack Rectangle
		Rectangle ar = new Rectangle();
		int arSize = 20;
		ar.width = arSize;
		ar.height = arSize;
		
		if(handler.getKeyManager().aUp)
		{
			ar.x = cb.x + cb.width / 2 - arSize /2;	//Gives Center x of Collision Bound then moves it over
			ar.y = cb.y - arSize;
		}
		else if(handler.getKeyManager().aDown)
		{
			ar.x = cb.x + cb.width / 2 - arSize /2;
			ar.y = cb.y + cb.height;
		}
		else if(handler.getKeyManager().aLeft)
		{
			ar.x = cb.x - arSize;
			ar.y = cb.y + cb.height /2 - arSize /2;
		}
		else if(handler.getKeyManager().aRight)
		{
			ar.x = cb.x + cb.width;
			ar.y = cb.y + cb.height /2 - arSize /2;
		}
		else
		{
			return;
		}
		
		//Reset Timer
		attackTimer = 0;
		
		for(Entity e : handler.getWorld().getEntityManager().getEntities())
		{
			if(e.equals(this))
				continue;
			if(e.getCollisionBounds(0, 0).intersects(ar))
			{
				e.hurt(1);
				return;
			}
			
		}
	}
	@Override
	public void die()
	{	
		System.out.println("YOU LOSE");
	}
	private void getInput()
	{
		xMove = 0;
		yMove = 0;
		
		if(handler.getKeyManager().up)
			yMove = -speed;
		if(handler.getKeyManager().down)
			yMove = speed;
		if(handler.getKeyManager().left)
			xMove = -speed;
		if(handler.getKeyManager().right)
			xMove = speed;
		
	}

	@Override
	public void render(Graphics g) 
	{
		g.drawImage(getCurrentAnimationFrame(), (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height, null);
		
		
		//COLLISION DETECTION RECTANGLE TESTER BELOW
		
//		g.setColor(Color.blue);
//		g.drawRect((int) (x + bounds.x - handler.getGameCamera().getxOffset()),
//					(int) (y + bounds.y - handler.getGameCamera().getyOffset()),
//					bounds.width, bounds.height);
	}
	
	private BufferedImage getCurrentAnimationFrame()
	{
		if(xMove < 0)
		{
			return animRight.getCurrentFrame();
		}
		else if(xMove > 0)
		{
			return animLeft.getCurrentFrame();
		}
		else if(yMove < 0)
		{
			return animUp.getCurrentFrame();
		}
		else
			return animDown.getCurrentFrame();
	}
}
