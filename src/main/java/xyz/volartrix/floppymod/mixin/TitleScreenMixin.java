package xyz.volartrix.floppymod.mixin;

import imgui.ImGui;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import xyz.volartrix.floppymod.FloppyMod;
import xyz.volartrix.floppymod.imgui.ImGuiImpl;

@Mixin(TitleScreen.class)
public class TitleScreenMixin {
    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo info) {
        FloppyMod.LOGGER.info("This line is printed by an example mod mixin!");
    }

    @Inject(method = "render", at = @At("RETURN"))
    private void render(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        ImGuiImpl.draw(io -> {
            // Example on how to use a custom Font
            // ImGui.pushFont(ImGuiImpl.defaultFont);
            ImGui.begin("Hello World");
            // Draw something here, see the official example module for more information:
            // https://github.com/ocornut/imgui/blob/master/imgui_demo.cpp
            ImGui.end();

            ImGui.showDemoWindow();
            // ImGui.popFont();
        });
    }
}
