package xyz.xdmatthewbx.unmojank.mixin;

import net.minecraft.world.dimension.BuiltinDimensionTypes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(BuiltinDimensionTypes.class)
public class BuiltinDimensionTypesMixin {

	@ModifyArgs(method = "bootstrap", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/dimension/DimensionType;<init>(Ljava/util/OptionalLong;ZZZZDZZIIILnet/minecraft/tag/TagKey;Lnet/minecraft/util/Identifier;FLnet/minecraft/world/dimension/DimensionType$MonsterSettings;)V", ordinal = 1))
	private static void netherHeightTypeFix(Args args) {
		args.set(8, -64);	// min_y
		args.set(9, 384);	// height
		args.set(10, 384);	// logical_height
	}

}
