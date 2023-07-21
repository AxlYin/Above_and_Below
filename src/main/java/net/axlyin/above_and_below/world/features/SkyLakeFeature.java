
package net.axlyin.above_and_below.world.features;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.levelgen.feature.LakeFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceKey;



import java.util.Set;

public class SkyLakeFeature extends LakeFeature {
    private final Set<ResourceKey<Level>> generateDimensions = Set.of(Level.OVERWORLD);

    public SkyLakeFeature() {
        super(Configuration.CODEC);
    }

    public boolean place(FeaturePlaceContext<LakeFeature.Configuration> context) {
        WorldGenLevel world = context.level();
        //if (BlockPos.getY(world.getHeight()) < 185)
           // return false;
        //if (!generateDimensions.contains(world.getLevel().dimension()))
            //return false;
        return super.place(context);
    }
}
