
package net.mcreator.gunmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BulletItem extends Item {
	public BulletItem() {
		super(new Item.Properties().stacksTo(30).rarity(Rarity.COMMON));
	}
}
