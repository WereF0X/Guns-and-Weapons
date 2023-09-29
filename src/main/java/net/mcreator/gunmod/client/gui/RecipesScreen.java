package net.mcreator.gunmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.gunmod.world.inventory.RecipesMenu;
import net.mcreator.gunmod.network.RecipesButtonMessage;
import net.mcreator.gunmod.GunModMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class RecipesScreen extends AbstractContainerScreen<RecipesMenu> {
	private final static HashMap<String, Object> guistate = RecipesMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_next;

	public RecipesScreen(RecipesMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("gun_mod:textures/screens/recipes.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("gun_mod:textures/screens/gun.png"), this.leftPos + 9, this.topPos + 18, 0, 0, 150, 70, 150, 70);

		guiGraphics.blit(new ResourceLocation("gun_mod:textures/screens/grenade.png"), this.leftPos + 7, this.topPos + 81, 0, 0, 150, 70, 150, 70);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.gun_mod.recipes.label_recipes"), 68, 10, -16777216, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_next = Button.builder(Component.translatable("gui.gun_mod.recipes.button_next"), e -> {
			if (true) {
				GunModMod.PACKET_HANDLER.sendToServer(new RecipesButtonMessage(0, x, y, z));
				RecipesButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 124, this.topPos + 3, 46, 20).build();
		guistate.put("button:button_next", button_next);
		this.addRenderableWidget(button_next);
	}
}
