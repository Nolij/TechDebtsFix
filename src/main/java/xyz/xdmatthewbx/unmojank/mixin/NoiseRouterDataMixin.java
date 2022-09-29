package xyz.xdmatthewbx.unmojank.mixin;

import net.minecraft.world.gen.noise.NoiseRouterData;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(NoiseRouterData.class)
public class NoiseRouterDataMixin {

	@ModifyArgs(method = "createNether", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/gen/noise/NoiseRouterData;m_psfarald(Lnet/minecraft/util/registry/Registry;II)Lnet/minecraft/world/gen/DensityFunction;"))
	private static void netherHeightYFix(Args args) {
		args.set(1, -64);	// min_y
		args.set(2, 384);	// height
	}

}
