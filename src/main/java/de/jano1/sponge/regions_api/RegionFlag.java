package de.jano1.sponge.regions_api;

import de.jano1.sponge.regions_api.subfaces.PluginRelatable;

/**
 * Created by Jano1 on 01.07.2017.
 */
public interface RegionFlag extends PluginRelatable {

    /**
     * Get the key of this Flag
     * @return Key as String
     */
    public String getKey();

    /**
     * Get the value of this Flag
     * @return Value as String
     */
    public String getValue();
}
