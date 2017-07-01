package de.jano1.sponge.regions_api;

import org.spongepowered.api.world.Location;

/**
 * Created by jleissner on 01.07.2017.
 */
public interface RegionShape {
    public boolean inShape(Location location);
}
