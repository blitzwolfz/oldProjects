package dev.jordan.isugame;
//Launcher; Starts Game
import dev.jordan.isugame.display.Display;


public class Launcher
{
	public static void main(String[] args)
	{
		Game game = new Game("ISU Game", 1280 , 720);
		game.start();
	}
}
