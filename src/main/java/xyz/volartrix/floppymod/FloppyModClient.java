package xyz.volartrix.floppymod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.text.*;
import org.lwjgl.glfw.GLFW;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FloppyModClient implements ClientModInitializer {

    public static final String CLIENT_MOD_ID = "floppy-mod-client";

    public static final Logger CLIENT_LOGGER = LoggerFactory.getLogger(CLIENT_MOD_ID);

    @Override
    public void onInitializeClient() {
        CLIENT_LOGGER.info("Floppy Mod Client initialized");
    }

}
