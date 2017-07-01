package de.jano1.sponge.regions_api.subfaces;

/**
 * Created by Jano1 on 01.07.2017.
 */
public interface PluginRelatable {
    public String[] getRelatedPluginIDs();
    public boolean isRelatedTo(String plugin_id);
    public void setRelationTo(String plugin_id,boolean status);
}
