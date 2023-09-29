
package net.mcreator.gunmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ShotgunBulletsItem extends Item {
	public ShotgunBulletsItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON));
	}
}
