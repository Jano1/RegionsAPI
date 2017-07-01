package de.jano1.sponge.regions_api;

import de.jano1.sponge.regions_api.subfaces.PluginRelatable;
import de.jano1.sponge.regions_api.subfaces.RegionParentable;

/**
 * Created by jleissner on 01.07.2017.
 */
public interface Region extends PluginRelatable, RegionParentable {
    public Shape getShape();
    public String getRegionID();
    public Flag[] getFlags();
}
