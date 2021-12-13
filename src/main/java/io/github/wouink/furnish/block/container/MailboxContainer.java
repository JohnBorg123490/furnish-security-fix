package io.github.wouink.furnish.block.container;

import io.github.wouink.furnish.FurnishManager;
import io.github.wouink.furnish.block.tileentity.MailboxTileEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Inventory;

public class MailboxContainer extends ConditionalSlotContainer {
	public MailboxContainer(int syncId, PlayerInventory playerInventory, IInventory inventory) {
		super(2, ConditionalSlot::never, FurnishManager.Containers.Mailbox.get(), syncId, playerInventory, inventory);
	}

	public MailboxContainer(int syncId, PlayerInventory playerInventory) {
		this(syncId, playerInventory, new Inventory(MailboxTileEntity.SIZE));
	}
}
