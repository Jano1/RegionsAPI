package de.jano1.sponge.regions_api;

import de.jano1.sponge.regions_api.subfaces.PluginRelatable;
import de.jano1.sponge.regions_api.subfaces.RegionParentable;
import org.spongepowered.api.service.context.Contextual;
import org.spongepowered.api.world.Location;

/**
 * Created by Jano1 on 01.07.2017.
 */
public interface Region extends PluginRelatable, RegionParentable, Contextual {

    /**
     * Get the Shape of this Region
     * @return The shape of this region
     */
    public RegionShape getShape();

    /**
     * Get the Flags belonging to this Region
     * @return An Array of Flags
     */
    public RegionFlag[] getFlags();

    /**
     * Test if this region contains any flags
     * @return True id there are at least one flag, false otherwise
     */
    public boolean hasFlags();

    /**
     * Test if this region contains any flags that are relatet to
     * a specific plugin
     * @param plugin_id The plugin id to test
     * @return True if related, false otherwise
     */
    public boolean hasFlagsRelatedTo(String plugin_id);

    /**
     * Same as @see{getFlags()}, but the returning Flags are all
     * belonging to the given plugin id
     * @param plugin_id The plugin you want the flags for
     * @return An Array of Flags
     */
    public RegionFlag[] getFlagsRelatedTo(String plugin_id);

    /**
     * Set a Flag for this Region
     * @param flag The flag to set
     */
    public void setFlag(RegionFlag flag);

    /**
     * Set an array of Flags for this region at once
     * @param flags The array which should be set
     */
    public void setFlags(RegionFlag[] flags);

    /**
     * Test if this Region contains a specific Location
     * @param location The Location to test
     * @return True, if location is contained, false otherwise
     */
    public boolean containsLocation(Location location);
}
