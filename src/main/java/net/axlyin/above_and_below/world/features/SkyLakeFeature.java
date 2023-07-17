
package net.axlyin.above_and_below.world.features;

import net.minecraft.world.level.levelgen.feature.DeltaFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceKey;

import java.util.Set;
import net.minecraft.world.level.levelgen.feature.configurations.DeltaFeatureConfiguration;

public class SkyLakeFeature extends DeltaFeature {
    private final Set<ResourceKey<Level>> generateDimensions = Set.of(Level.OVERWORLD);

    public SkyLakeFeature() {
        super(DeltaFeatureConfiguration.CODEC);
    }

    public boolean place(FeaturePlaceContext<DeltaFeatureConfiguration> context) {
        WorldGenLevel world = context.level();
        if (!generateDimensions.contains(world.getLevel().dimension()))
            return false;
        return super.place(context);
    }
}
