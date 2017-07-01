package de.jano1.sponge.regions_api.subfaces;

/**
 * Created by Jano1 on 01.07.2017.
 */
public interface PluginRelatable {
    /**
     * Get all the pluginId's that are related to this object.
     * @return Array of ids
     */
    public String[] getRelatedPluginIDs();

    /**
     * Test relation to a plugin
     * @param plugin_id The id of the plugin
     * @return True if there is a relation, false if not
     */
    public boolean isRelatedTo(String plugin_id);

    /**
     * Set the relation to a plugin (should also unset if status equals false!)
     * @param plugin_id The id of the plugin
     * @param status The desired status of the relation
     */
    public void setRelationTo(String plugin_id,boolean status);
}
