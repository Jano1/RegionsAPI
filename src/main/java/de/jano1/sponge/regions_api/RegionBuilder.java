package de.jano1.sponge.regions_api;

/**
 * Created by Jano1 on 01.07.2017.
 */
public interface RegionBuilder {
    public void startBuilding();
    public void cancelBuilding();
    public void finishBuilding();

    public boolean isValidBuild();
    public Region getBuildedRegion();
}
