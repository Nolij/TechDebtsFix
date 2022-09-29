package xyz.xdmatthewbx.unmojank.mixin;

import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.carver.ConfiguredCarvers;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(ConfiguredCarvers.class)
public class ConfiguredCarversMixin {

	@ModifyArgs(method = "<clinit>", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/gen/carver/CaveCarverConfig;<init>(FLnet/minecraft/world/gen/heightprovider/HeightProvider;Lnet/minecraft/util/math/floatprovider/FloatProvider;Lnet/minecraft/world/gen/YOffset;Lnet/minecraft/util/HolderSet;Lnet/minecraft/util/math/floatprovider/FloatProvider;Lnet/minecraft/util/math/floatprovider/FloatProvider;Lnet/minecraft/util/math/floatprovider/FloatProvider;)V", ordinal = 0))
	private static void netherHeightBottomOffsetFix(Args args) {
		args.set(1, UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.belowTop(1)));
		args.set(3, YOffset.fixed(10));
	}

}
