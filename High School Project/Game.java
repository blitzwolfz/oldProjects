package dev.jordan.isugame;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import dev.jordan.isugame.display.Display;
import dev.jordan.isugame.gfx.Assets;
import dev.jordan.isugame.gfx.GameCamera;
import dev.jordan.isugame.input.KeyManager;
import dev.jordan.isugame.input.MouseManager;
import dev.jordan.isugame.states.GameState;
import dev.jordan.isugame.states.MenuState;
import dev.jordan.isugame.states.SettingsState;
import dev.jordan.isugame.states.State;

/*
	Main Class
	Start Everything
	Run Everything
	Holds Base Code
 */
public class Game implements Runnable
{
	private Display display;
	private int width, height;
	public String title;
	public static boolean wasdControls = true;
	
	private boolean running = false;
	private Thread thread;
	
	private BufferStrategy bs;
	private Graphics g;
	
	//States
	public State gameState;
	public State menuState;
	public State settingsState;
	
	//Input
	private KeyManager keyManager;
	private MouseManager mouseManager;
	
	//CAMERA
	private GameCamera gameCamera;
	
	//HANDLER
	private Handler handler;
	
	public Game(String title, int width, int height)
	{
		this.width = width;
		this.height = height;
		this.title = title;
		keyManager = new KeyManager();
		mouseManager = new MouseManager();
	}
	//Creating Initialization method
	private void init()
	{
		display = new Display(title, width, height);	//Initializes display
		display.getFrame().addKeyListener(keyManager);
		display.getFrame().addMouseListener(mouseManager);
		display.getFrame().addMouseMotionListener(mouseManager);
		display.getCanvas().addMouseListener(mouseManager);
		display.getCanvas().addMouseMotionListener(mouseManager);
		Assets.init();
		
		handler = new Handler(this);
		gameCamera = new GameCamera(handler, 0,0);
		
		gameState = new GameState(handler);
		menuState = new MenuState(handler);
		settingsState = new SettingsState(handler);
		State.setState(menuState);
	}

	//Creating Update Method
	private void tick()
	{
		keyManager.tick();
		if(State.getState() != null)
			State.getState().tick();
		
	}
	//Creating Render Method
	private void render()
	{
		bs = display.getCanvas().getBufferStrategy();
		if(bs == null)
		{
			display.getCanvas().createBufferStrategy(3);
			return;
			//Creates 3 buffers if there are none
		}
		
		g = bs.getDrawGraphics();	//Sets Graphics to = What comes from buffer
		//ClearScreen
		g.clearRect(0, 0, width, height);
		
		//Start Image Render
		
		if(State.getState() != null)
			State.getState().render(g);
		
		
		//End Image Render
		
		bs.show();
		g.dispose();
	}
	public void run()
	{
		init();
		
		//FRAME RATE COUNTER
		
		int nano = 1000000000;			//How many NanoSeconds in a Second (NanoSeconds are More Accurate)
		int fps = 60;					//How Many Frames Per Second I want
		double timePerTick = nano/fps;	//How Many Times I want to run it Every Second
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		long timer = 0;			//FPS Counter
		int ticks = 0;
		
		//Game Loop
		while(running)
		{
			now = System.nanoTime();
			delta += (now - lastTime) / timePerTick;
			timer += now - lastTime;  //Adds amount of time that the code was last Called
			lastTime = now;
			
			if(delta >= 1) 
			{
				tick();
				render();
				ticks++;
				delta--;
			}
			
			if(timer >= nano)
			{
				System.out.println("FPS: " + ticks);
				ticks = 0;
				timer = 0;
			}
		}
		stop();
	}
	
	//Input Getters and Setters
	
	//KeyBoard
	public KeyManager getKeyManager()
	{
		return keyManager;
	}
	//Mouse
	public MouseManager getMouseManager()
	{
		return mouseManager;
	}
	
	//Game Camera
	public GameCamera getGameCamera()
	{
		return gameCamera;
	}
	//GETTERS AND SETTERS FOR WIDTH AND HEIGHT
	public int getWidth()
	{
		return width;
	}
	public int getHeight()
	{
		return height;
	}
	
	//Initializing Thread
	public synchronized void start()
	{
		if(running)
			return;
		
		running = true;
		thread = new Thread(this);
		thread.start();
	}

	public synchronized void stop()
	{
		if(!running)
			return;
		running = false;
		//Try Catch Statement Generated Through Eclipse
		try 
		{
			thread.join();
		} catch (InterruptedException e)
		
		{
			e.printStackTrace();
		}
	}
}
