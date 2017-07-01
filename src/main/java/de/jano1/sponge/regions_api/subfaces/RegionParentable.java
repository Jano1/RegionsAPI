package de.jano1.sponge.regions_api.subfaces;

/**
 * Created by Jano1 on 01.07.2017.
 */
public interface RegionParentable {

    /**
     * Get all the ids of the parents of this region
     * @return Array of parent-ids for this region
     */
    public String[] getParents();

    /**
     * Test if this region has parents at all
     * @return True if parents exist, false if not
     */
    public boolean hasParents();

    /**
     * Test if this region has a specific parent
     * @param region_id The region id to test
     * @return True if given region is parent of this region
     */
    public boolean hasParent(String region_id);

    /**
     * Set a parent for this region (should also unset if status equals false)
     * @param region_id The desired parent
     * @param status The desired setting
     */
    public void setParentalStatus(String region_id, boolean status);

    /**
     * Shorter version of @see{setParentalStatus()}, use this to add a parent in a shorter way
     * @param region_id The desired parent
     */
    public void addParent(String region_id);
}
