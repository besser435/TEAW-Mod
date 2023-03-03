package net.besser.teaw.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.besser.teaw.init.TeawModBlocks;

import javax.annotation.Nullable;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class DeleteDevProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		String usernameTest = "";
		{
			List<? extends Player> _players = new ArrayList<>(world.players());
			for (Entity entityiterator : _players) {
				usernameTest = entity.getDisplayName().getString();
				if ((usernameTest).equals("brandonusa") || (usernameTest).equals("josamo8")) {
					break;
				} else {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(TeawModBlocks.TEST_BLOCK.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 10000,
								_player.inventoryMenu.getCraftSlots());
					}
				}
			}
		}
	}
}
