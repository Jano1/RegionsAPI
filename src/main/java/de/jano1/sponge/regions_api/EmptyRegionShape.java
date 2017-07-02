package de.jano1.sponge.regions_api;

import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;

/**
 * Created by Jano1 on 02.07.2017.
 */
public class EmptyRegionShape implements RegionShape {
    @Override
    public boolean contains(Location location) {
        return false;
    }

    @Override
    public void addVertice(Location<World> location) {
        // nothing
    }

    @Override
    public void removeVertice(Location<World> location) {
        // nothing
    }
}
