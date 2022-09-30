/*
	Static Entities
	Where Entities Don't Change
	Entities That exist but won't move example Tree, rock etc.
 */
package dev.jordan.isugame.entities.statics;

import dev.jordan.isugame.Handler;
import dev.jordan.isugame.entities.Entity;

public abstract class StaticEntity extends Entity
{
	public StaticEntity(Handler handler, float x, float y, int width, int height)
	{
		super(handler, x, y, width, height);
	}
}
