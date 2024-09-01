package xyz.volartrix.floppymod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FloppyMod implements ModInitializer {
	public static final String MOD_ID = "floppy-mod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Floppy Mod initialized");
	}
}