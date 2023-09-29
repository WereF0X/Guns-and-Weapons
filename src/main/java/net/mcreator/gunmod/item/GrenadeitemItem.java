
package net.mcreator.gunmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GrenadeitemItem extends Item {
	public GrenadeitemItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
