
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.besser.teaw.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class TeawModTabs {
	public static CreativeModeTab TAB_TEAW;

	public static void load() {
		TAB_TEAW = new CreativeModeTab("tabteaw") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(TeawModItems.DIET_COIN.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
