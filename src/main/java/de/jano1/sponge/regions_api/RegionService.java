package de.jano1.sponge.regions_api;

import org.spongepowered.api.service.context.ContextualService;
import org.spongepowered.api.world.Location;

import java.util.Optional;

/**
 * Created by Jano1 on 01.07.2017.
 */
public interface RegionService{

    /**
     * Sets the default region
     * @param to_set A region object
     */
    public void setDefaultRegion(Region to_set);

    /**
     * Get all Regions that are available
     * @return Array of Regions
     */
    public Region[] getRegions();

    /**
     * Get a Region with a specific id
     * @param region_id The region id
     * @return A Region you are looking for
     */
    public Optional<Region> getRegionWithID(String region_id);

    /**
     * Adds a Region to the Service
     * @param region The region to add
     */
    public void addRegion(Region region);

    /**
     * Removes a Region from the Service
     * @param region_id The region to remove
     */
    public void removeRegion(String region_id);

    /**
     * Get all Regions that contains a specific Location
     * @param location The Location to test
     * @return An Array of Regions containing the given Location
     */
    public Region[] getRegionsFor(Location location);
}
