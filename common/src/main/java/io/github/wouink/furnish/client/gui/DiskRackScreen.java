package io.github.wouink.furnish.client.gui;

import io.github.wouink.furnish.Furnish;
import io.github.wouink.furnish.block.container.DiskRackContainer;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

// copied from net.minecraft.client.gui.screens.inventory.ContainerScreen
public class DiskRackScreen extends AbstractContainerScreen<DiskRackContainer> {
	private static final ResourceLocation CONTAINER_BACKGROUND = new ResourceLocation(Furnish.MODID, "textures/gui/disk_rack.png");
	private final int containerRows = 1;

	public DiskRackScreen(DiskRackContainer menu, Inventory playerInventory, Component title) {
		super(menu, playerInventory, title);
		this.imageHeight = 114 + this.containerRows * 18;
		this.inventoryLabelY = this.imageHeight - 94;
	}

	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTick) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTick);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	protected void renderBg(GuiGraphics guiGraphics, float partialTick, int mouseX, int mouseY) {
		int i = (this.width - this.imageWidth) / 2;
		int j = (this.height - this.imageHeight) / 2;
		guiGraphics.blit(CONTAINER_BACKGROUND, i, j, 0, 0, this.imageWidth, this.containerRows * 18 + 17);
		guiGraphics.blit(CONTAINER_BACKGROUND, i, j + this.containerRows * 18 + 17, 0, 126, this.imageWidth, 96);
	}
}
