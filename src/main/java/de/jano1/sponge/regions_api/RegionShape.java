package de.jano1.sponge.regions_api;

import org.spongepowered.api.world.Location;

/**
 * Created by Jano1 on 01.07.2017.
 */
public interface RegionShape {

    /**
     * Test if this Shape contains a Location
     * @param location The Location to test
     * @return True if this shape contains the location, false if not
     */
    public boolean contains(Location location);
}
