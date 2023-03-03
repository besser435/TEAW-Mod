
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.besser.teaw.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.besser.teaw.item.LossCoinItem;
import net.besser.teaw.item.DIETCoinItem;
import net.besser.teaw.item.CoinBlankItem;
import net.besser.teaw.TeawMod;

public class TeawModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TeawMod.MODID);
	public static final RegistryObject<Item> DIET_COIN = REGISTRY.register("diet_coin", () -> new DIETCoinItem());
	public static final RegistryObject<Item> LOSS_COIN = REGISTRY.register("loss_coin", () -> new LossCoinItem());
	public static final RegistryObject<Item> COIN_BLANK = REGISTRY.register("coin_blank", () -> new CoinBlankItem());
	public static final RegistryObject<Item> TEST_BLOCK = block(TeawModBlocks.TEST_BLOCK, null);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
