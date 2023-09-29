
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gunmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.gunmod.item.ShotgunItem;
import net.mcreator.gunmod.item.ShotgunBulletsItem;
import net.mcreator.gunmod.item.GrenadeitemItem;
import net.mcreator.gunmod.item.GrenadeItem;
import net.mcreator.gunmod.item.BulletproofchestplateItem;
import net.mcreator.gunmod.item.BulletItem;
import net.mcreator.gunmod.item.AssaultRifleItem;
import net.mcreator.gunmod.GunModMod;

public class GunModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, GunModMod.MODID);
	public static final RegistryObject<Item> GRENADE = REGISTRY.register("grenade", () -> new GrenadeItem());
	public static final RegistryObject<Item> GRENADEITEM = REGISTRY.register("grenadeitem", () -> new GrenadeitemItem());
	public static final RegistryObject<Item> BULLET = REGISTRY.register("bullet", () -> new BulletItem());
	public static final RegistryObject<Item> ASSAULT_RIFLE = REGISTRY.register("assault_rifle", () -> new AssaultRifleItem());
	public static final RegistryObject<Item> BULLETPROOFCHESTPLATE_CHESTPLATE = REGISTRY.register("bulletproofchestplate_chestplate", () -> new BulletproofchestplateItem.Chestplate());
	public static final RegistryObject<Item> SHOTGUN_BULLETS = REGISTRY.register("shotgun_bullets", () -> new ShotgunBulletsItem());
	public static final RegistryObject<Item> SHOTGUN = REGISTRY.register("shotgun", () -> new ShotgunItem());
}
