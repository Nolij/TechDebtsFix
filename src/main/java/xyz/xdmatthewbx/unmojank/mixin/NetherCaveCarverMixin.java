package xyz.xdmatthewbx.unmojank.mixin;

import net.minecraft.world.gen.carver.CarverContext;
import net.minecraft.world.gen.carver.NetherCaveCarver;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(NetherCaveCarver.class)
public class NetherCaveCarverMixin {

	@Redirect(method = "carveAtPoint(Lnet/minecraft/world/gen/carver/CarverContext;Lnet/minecraft/world/gen/carver/CaveCarverConfig;Lnet/minecraft/world/chunk/Chunk;Ljava/util/function/Function;Lnet/minecraft/world/gen/carver/CarvingMask;Lnet/minecraft/util/math/BlockPos$Mutable;Lnet/minecraft/util/math/BlockPos$Mutable;Lnet/minecraft/world/gen/chunk/AquiferSampler;Lorg/apache/commons/lang3/mutable/MutableBoolean;)Z", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/gen/carver/CarverContext;getMinY()I"))
	private int netherHeightSeaLevelFix(CarverContext instance) {
		return 0;
	}

}
