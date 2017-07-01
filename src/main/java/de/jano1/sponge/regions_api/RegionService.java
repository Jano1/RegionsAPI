package de.jano1.sponge.regions_api;

/**
 * Created by jleissner on 01.07.2017.
 */
public interface RegionService {
    public Region[] getRegions();
    public Region getRegionWithID(String region_id);
    public void addRegion(Region region);
    public void removeRegion(String region_id);
}