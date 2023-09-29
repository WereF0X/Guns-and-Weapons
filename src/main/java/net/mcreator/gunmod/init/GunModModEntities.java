
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gunmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.gunmod.entity.ShotgunEntity;
import net.mcreator.gunmod.entity.GrenadeEntity;
import net.mcreator.gunmod.entity.AssaultRifleEntity;
import net.mcreator.gunmod.GunModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GunModModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, GunModMod.MODID);
	public static final RegistryObject<EntityType<GrenadeEntity>> GRENADE = register("projectile_grenade",
			EntityType.Builder.<GrenadeEntity>of(GrenadeEntity::new, MobCategory.MISC).setCustomClientFactory(GrenadeEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AssaultRifleEntity>> ASSAULT_RIFLE = register("projectile_assault_rifle",
			EntityType.Builder.<AssaultRifleEntity>of(AssaultRifleEntity::new, MobCategory.MISC).setCustomClientFactory(AssaultRifleEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ShotgunEntity>> SHOTGUN = register("projectile_shotgun",
			EntityType.Builder.<ShotgunEntity>of(ShotgunEntity::new, MobCategory.MISC).setCustomClientFactory(ShotgunEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}
}
