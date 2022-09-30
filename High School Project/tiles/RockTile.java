/*
	Rock Tile
	Solid Block - UnWalkable
 */
package dev.jordan.isugame.tiles;

import dev.jordan.isugame.gfx.Assets;

public class RockTile extends Tile
{
	public RockTile(int id) 
	{
		super(Assets.rock, id);
	}
	@Override
	public boolean isSolid()
	{
		return true;
	}
}
