package net.qlx.skyless;

import net.fabricmc.api.ModInitializer;

import net.qlx.skyless.item.ModItemGroups;
import net.qlx.skyless.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Skyless implements ModInitializer {
	public static final String MOD_ID = "skyless";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
	}
}