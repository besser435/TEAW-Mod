
package net.besser.teaw.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.besser.teaw.init.TeawModTabs;

import java.util.List;

public class DIETCoinItem extends Item {
	public DIETCoinItem() {
		super(new Item.Properties().tab(TeawModTabs.TAB_TEAW).stacksTo(1).rarity(Rarity.UNCOMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("The owner of this coin is part of the TEAW DIET"));
	}
}
