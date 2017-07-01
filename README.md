# RegionsAPI
This will provide an API for SpongeForge for the use of regions over different plugins. More will coming soon.

## Interfaces / AbstractClasses
RegionsAPI will contain the following Interfaces/AbstractClasses ready for implementation for any Regions-Plugin:
  * RegionService
  * Region
  * RegionID
  * RegionBuilder
  * Flag
  * Shape

## Idea
A `Region` contains:
 * a `RegionID` object for eays identification
 * a `Shape` object which defines the boundaries of the region
 * optional multiple `Region` objects as parents for inheritance of flags
 * optional multiple `Flag` objects


So any plugin can see if there are regions or create/modify them. Regions and Flags can be marked as related to a specific plugin.

## Features
 * Will possibly come with an minimalistic implemented RegionService.
 
