package xyz.volartrix.floppymod;

import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class ModKeyBindings {

    private static final String CATEGORY = "key.category.floppymod";

    public static KeyBinding register(int key, String translationKey) {
        return KeyBindingHelper.registerKeyBinding(new KeyBinding(
                translationKey,
                InputUtil.Type.KEYSYM,
                key,
                CATEGORY
        ));
    }
}