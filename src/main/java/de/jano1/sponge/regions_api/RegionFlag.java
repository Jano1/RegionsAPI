package de.jano1.sponge.regions_api;

import de.jano1.sponge.regions_api.subfaces.PluginRelatable;

/**
 * Created by jleissner on 01.07.2017.
 */
public interface RegionFlag extends PluginRelatable {
    public String getKey();
    public String getValue();
}
