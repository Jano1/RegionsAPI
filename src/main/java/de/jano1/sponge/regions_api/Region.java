package de.jano1.sponge.regions_api;

import de.jano1.sponge.regions_api.subfaces.PluginRelatable;
import de.jano1.sponge.regions_api.subfaces.RegionParentable;
import org.spongepowered.api.service.context.Contextual;

/**
 * Created by Jano1 on 01.07.2017.
 */
public interface Region extends PluginRelatable, RegionParentable, Contextual {
    public RegionShape getShape();
    public RegionFlag[] getFlags();
}
