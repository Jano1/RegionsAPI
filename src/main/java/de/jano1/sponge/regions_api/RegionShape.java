package de.jano1.sponge.regions_api;

import org.spongepowered.api.world.Location;

/**
 * Created by Jano1 on 01.07.2017.
 */
public interface RegionShape {
    public boolean contains(Location location);
}
