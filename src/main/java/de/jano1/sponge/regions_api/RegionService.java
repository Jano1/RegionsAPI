package de.jano1.sponge.regions_api;

import org.spongepowered.api.service.context.ContextualService;
import org.spongepowered.api.world.Location;

/**
 * Created by Jano1 on 01.07.2017.
 */
public interface RegionService extends ContextualService<Region>{
    public Region[] getRegions();
    public Region getRegionWithID(String region_id);
    public void addRegion(Region region);
    public void removeRegion(String region_id);

    public Region[] getRegionsThatContains(Location location);
}
