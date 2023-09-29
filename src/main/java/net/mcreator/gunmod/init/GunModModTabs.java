
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gunmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.gunmod.GunModMod;

public class GunModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GunModMod.MODID);
	public static final RegistryObject<CreativeModeTab> GUN_MOD = REGISTRY.register("gun_mod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.gun_mod.gun_mod")).icon(() -> new ItemStack(Blocks.GLOW_LICHEN)).displayItems((parameters, tabData) -> {
				tabData.accept(GunModModItems.GRENADE.get());
				tabData.accept(GunModModItems.BULLET.get());
				tabData.accept(GunModModItems.ASSAULT_RIFLE.get());
				tabData.accept(GunModModItems.BULLETPROOFCHESTPLATE_CHESTPLATE.get());
				tabData.accept(GunModModItems.SHOTGUN_BULLETS.get());
				tabData.accept(GunModModItems.SHOTGUN.get());
			})

					.build());
}
