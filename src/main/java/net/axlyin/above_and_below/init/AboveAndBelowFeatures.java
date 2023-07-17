//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.axlyin.above_and_below.init;

import net.axlyin.above_and_below.world.features.SkyLakeFeature;
import net.axlyin.above_and_below.world.features.SkySpringFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@EventBusSubscriber
public class AboveAndBelowFeatures {
    public static final DeferredRegister<Feature<?>> REGISTRY;
    public static final RegistryObject<Feature<?>> SKY_LAKE;
    public static final RegistryObject<Feature<?>> SKY_SPRING;

    public AboveAndBelowFeatures() {
    }

    static {
        REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, "above_and_below");
        SKY_LAKE = REGISTRY.register("sky_lake", SkyLakeFeature::new);
        SKY_SPRING = REGISTRY.register("sky_spring", SkySpringFeature::new);
    }
}
