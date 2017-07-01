package de.jano1.sponge.regions_api.subfaces;

/**
 * Created by jleissner on 01.07.2017.
 */
public interface RegionParentable {
    public String[] getParents();
    public boolean isParent(String plugin_id);
    public void setParentalStatus(String plugin_id, boolean status);
    public void addParent(String plugin_id);
}
