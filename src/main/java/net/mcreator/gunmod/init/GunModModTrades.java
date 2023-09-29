
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.gunmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class GunModModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == GunModModVillagerProfessions.GUN_SMITH.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 23),

					new ItemStack(GunModModItems.GRENADE.get()), 2, 5, 0.05f));
		}
		if (event.getType() == GunModModVillagerProfessions.GUN_SMITH.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.GOLD_NUGGET, 6), new ItemStack(Items.IRON_NUGGET, 8), new ItemStack(GunModModItems.BULLET.get(), 3), 10, 5, 0.05f));
		}
		if (event.getType() == GunModModVillagerProfessions.GUN_SMITH.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 43),

					new ItemStack(GunModModItems.ASSAULT_RIFLE.get()), 10, 5, 0.05f));
		}
		if (event.getType() == GunModModVillagerProfessions.GUN_SMITH.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 27), new ItemStack(Items.IRON_NUGGET, 40), new ItemStack(GunModModItems.BULLETPROOFCHESTPLATE_CHESTPLATE.get()), 10, 5, 0.05f));
		}
		if (event.getType() == GunModModVillagerProfessions.GUN_SMITH.get()) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 50), new ItemStack(Items.IRON_INGOT, 5), new ItemStack(GunModModItems.SHOTGUN.get()), 2, 5, 0.05f));
		}
		if (event.getType() == GunModModVillagerProfessions.GUN_SMITH.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 9), new ItemStack(Items.GOLD_NUGGET, 12), new ItemStack(GunModModItems.SHOTGUN_BULLETS.get(), 3), 10, 5, 0.05f));
		}
	}
}
