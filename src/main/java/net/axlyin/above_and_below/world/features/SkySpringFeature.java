
package net.axlyin.above_and_below.world.features;

import net.minecraft.world.level.levelgen.feature.SpringFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceKey;

import java.util.Set;
import net.minecraft.world.level.levelgen.feature.SpringFeature;
import net.minecraft.world.level.levelgen.feature.configurations.SpringConfiguration;

public class SkySpringFeature extends SpringFeature {
    private final Set<ResourceKey<Level>> generateDimensions = Set.of(Level.OVERWORLD);

    public SkySpringFeature() {
        super(SpringConfiguration.CODEC);
    }

    public boolean place(FeaturePlaceContext<SpringConfiguration> context) {
        WorldGenLevel world = context.level();
        if (!generateDimensions.contains(world.getLevel().dimension()))
            return false;
        return super.place(context);
    }
}
