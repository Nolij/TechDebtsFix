package xyz.xdmatthewbx.unmojank.mixin;

import net.minecraft.world.gen.chunk.GenerationShapeConfig;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GenerationShapeConfig.class)
public class GenerationShapeConfigMixin {

	@Mutable
	@Shadow
	@Final
	protected static GenerationShapeConfig field_37138;

	@Inject(method = "<clinit>", at = @At("RETURN"))
	private static void netherHeightFieldChanges(CallbackInfo ci) {
		field_37138 = GenerationShapeConfig.create(-64, 384, 1, 2);
	}

}
