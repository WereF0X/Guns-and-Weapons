
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gunmod.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.gunmod.client.gui.RecipesScreen;
import net.mcreator.gunmod.client.gui.Recipes2Screen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class GunModModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(GunModModMenus.RECIPES.get(), RecipesScreen::new);
			MenuScreens.register(GunModModMenus.RECIPES_2.get(), Recipes2Screen::new);
		});
	}
}
