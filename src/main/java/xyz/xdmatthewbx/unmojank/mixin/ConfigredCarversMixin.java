package xyz.xdmatthewbx.unmojank.mixin;

import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.carver.ConfiguredCarvers;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(ConfiguredCarvers.class)
public class ConfigredCarversMixin {

	@ModifyArgs(method = "<clinit>", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/gen/heightprovider/UniformHeightProvider;create(Lnet/minecraft/world/gen/YOffset;Lnet/minecraft/world/gen/YOffset;)Lnet/minecraft/world/gen/heightprovider/UniformHeightProvider;", ordinal = 3))
	private static void netherHeightBottomOffsetFix(Args args) {
		args.set(0, YOffset.aboveBottom(0));
	}

}
