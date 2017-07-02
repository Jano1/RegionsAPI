package de.jano1.sponge.regions_api;

import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;

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

    /**
     * Add a vertice to the Shape
     * @param location
     */
    public void addVertice(Location<World> location);

    /**
     * Removes a vertice in the shape
     * @param location
     */
    public void removeVertice(Location<World> location);
}
