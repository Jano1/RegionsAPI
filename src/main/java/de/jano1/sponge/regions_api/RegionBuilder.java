package de.jano1.sponge.regions_api;

/**
 * Created by Jano1 on 01.07.2017.
 */
public interface RegionBuilder {

    /**
     * Starts the current building process
     */
    public void startBuilding();

    /**
     * Cancel the current building process
     */
    public void cancelBuilding();

    /**
     * Finish the current building process
     */
    public void finishBuilding();

    /**
     * Test if the current contained region is valid.
     * @return True if everything is ok, false otherwise
     */
    public boolean isValidBuild();

    /**
     * Get the current region (if possible when finished and valid)
     * @return A Region-Object
     */
    public Region getRegion();
}
