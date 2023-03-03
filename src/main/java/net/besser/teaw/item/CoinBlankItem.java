
package net.besser.teaw.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.besser.teaw.init.TeawModTabs;

public class CoinBlankItem extends Item {
	public CoinBlankItem() {
		super(new Item.Properties().tab(TeawModTabs.TAB_TEAW).stacksTo(64).rarity(Rarity.COMMON));
	}
}
