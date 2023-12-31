
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gunmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.gunmod.world.inventory.RecipesMenu;
import net.mcreator.gunmod.world.inventory.Recipes2Menu;
import net.mcreator.gunmod.GunModMod;

public class GunModModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, GunModMod.MODID);
	public static final RegistryObject<MenuType<RecipesMenu>> RECIPES = REGISTRY.register("recipes", () -> IForgeMenuType.create(RecipesMenu::new));
	public static final RegistryObject<MenuType<Recipes2Menu>> RECIPES_2 = REGISTRY.register("recipes_2", () -> IForgeMenuType.create(Recipes2Menu::new));
}
