package com.intellectualcrafters.plot;

import static org.bukkit.Material.ACACIA_STAIRS;
import static org.bukkit.Material.BEACON;
import static org.bukkit.Material.BEDROCK;
import static org.bukkit.Material.BIRCH_WOOD_STAIRS;
import static org.bukkit.Material.BOOKSHELF;
import static org.bukkit.Material.BREWING_STAND;
import static org.bukkit.Material.BRICK;
import static org.bukkit.Material.BRICK_STAIRS;
import static org.bukkit.Material.BURNING_FURNACE;
import static org.bukkit.Material.CAKE_BLOCK;
import static org.bukkit.Material.CAULDRON;
import static org.bukkit.Material.CLAY;
import static org.bukkit.Material.CLAY_BRICK;
import static org.bukkit.Material.COAL_BLOCK;
import static org.bukkit.Material.COAL_ORE;
import static org.bukkit.Material.COBBLESTONE;
import static org.bukkit.Material.COBBLESTONE_STAIRS;
import static org.bukkit.Material.COBBLE_WALL;
import static org.bukkit.Material.COMMAND;
import static org.bukkit.Material.DARK_OAK_STAIRS;
import static org.bukkit.Material.DAYLIGHT_DETECTOR;
import static org.bukkit.Material.DIAMOND_BLOCK;
import static org.bukkit.Material.DIAMOND_ORE;
import static org.bukkit.Material.DIRT;
import static org.bukkit.Material.DISPENSER;
import static org.bukkit.Material.DROPPER;
import static org.bukkit.Material.EMERALD_BLOCK;
import static org.bukkit.Material.EMERALD_ORE;
import static org.bukkit.Material.ENCHANTMENT_TABLE;
import static org.bukkit.Material.ENDER_PORTAL_FRAME;
import static org.bukkit.Material.ENDER_STONE;
import static org.bukkit.Material.FURNACE;
import static org.bukkit.Material.GLASS;
import static org.bukkit.Material.GLOWSTONE;
import static org.bukkit.Material.GOLD_BLOCK;
import static org.bukkit.Material.GOLD_ORE;
import static org.bukkit.Material.GRASS;
import static org.bukkit.Material.GRAVEL;
import static org.bukkit.Material.HARD_CLAY;
import static org.bukkit.Material.HAY_BLOCK;
import static org.bukkit.Material.HUGE_MUSHROOM_1;
import static org.bukkit.Material.HUGE_MUSHROOM_2;
import static org.bukkit.Material.IRON_BLOCK;
import static org.bukkit.Material.IRON_ORE;
import static org.bukkit.Material.JACK_O_LANTERN;
import static org.bukkit.Material.JUKEBOX;
import static org.bukkit.Material.JUNGLE_WOOD_STAIRS;
import static org.bukkit.Material.LAPIS_BLOCK;
import static org.bukkit.Material.LAPIS_ORE;
import static org.bukkit.Material.LEAVES;
import static org.bukkit.Material.LEAVES_2;
import static org.bukkit.Material.LOG;
import static org.bukkit.Material.LOG_2;
import static org.bukkit.Material.MELON_BLOCK;
import static org.bukkit.Material.MOB_SPAWNER;
import static org.bukkit.Material.MOSSY_COBBLESTONE;
import static org.bukkit.Material.MYCEL;
import static org.bukkit.Material.NETHERRACK;
import static org.bukkit.Material.NETHER_BRICK;
import static org.bukkit.Material.NETHER_BRICK_STAIRS;
import static org.bukkit.Material.NOTE_BLOCK;
import static org.bukkit.Material.OBSIDIAN;
import static org.bukkit.Material.PACKED_ICE;
import static org.bukkit.Material.PUMPKIN;
import static org.bukkit.Material.QUARTZ_BLOCK;
import static org.bukkit.Material.QUARTZ_ORE;
import static org.bukkit.Material.QUARTZ_STAIRS;
import static org.bukkit.Material.REDSTONE_BLOCK;
import static org.bukkit.Material.SAND;
import static org.bukkit.Material.SANDSTONE;
import static org.bukkit.Material.SANDSTONE_STAIRS;
import static org.bukkit.Material.SMOOTH_BRICK;
import static org.bukkit.Material.SMOOTH_STAIRS;
import static org.bukkit.Material.SNOW_BLOCK;
import static org.bukkit.Material.SOUL_SAND;
import static org.bukkit.Material.SPONGE;
import static org.bukkit.Material.SPRUCE_WOOD_STAIRS;
import static org.bukkit.Material.STONE;
import static org.bukkit.Material.WOOD;
import static org.bukkit.Material.WOOD_STAIRS;
import static org.bukkit.Material.WOOL;
import static org.bukkit.Material.WORKBENCH;
import static org.bukkit.Material.getMaterial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.block.Biome;
import org.bukkit.configuration.ConfigurationSection;

/**
 *
 * @author Jesse Boyd
 *
 */
public abstract class PlotWorld {

    // TODO make this configurable
    // make non static and static_default_valu + add config option
    @SuppressWarnings("deprecation")
    public static ArrayList<Material> BLOCKS                          = new ArrayList<Material>(Arrays.asList(new Material[] { ACACIA_STAIRS, BEACON, BEDROCK, BIRCH_WOOD_STAIRS, BOOKSHELF, BREWING_STAND, BRICK, BRICK_STAIRS, BURNING_FURNACE, CAKE_BLOCK, CAULDRON, CLAY_BRICK, CLAY, COAL_BLOCK, COAL_ORE, COBBLE_WALL, COBBLESTONE, COBBLESTONE_STAIRS, COMMAND, DARK_OAK_STAIRS, DAYLIGHT_DETECTOR, DIAMOND_ORE, DIAMOND_BLOCK, DIRT, DISPENSER, DROPPER, EMERALD_BLOCK, EMERALD_ORE, ENCHANTMENT_TABLE, ENDER_PORTAL_FRAME, ENDER_STONE, FURNACE, GLOWSTONE, GOLD_ORE, GOLD_BLOCK, GRASS, GRAVEL, GLASS, HARD_CLAY, HAY_BLOCK, HUGE_MUSHROOM_1, HUGE_MUSHROOM_2, IRON_BLOCK, IRON_ORE, JACK_O_LANTERN, JUKEBOX, JUNGLE_WOOD_STAIRS, LAPIS_BLOCK, LAPIS_ORE, LEAVES, LEAVES_2, LOG, LOG_2, MELON_BLOCK, MOB_SPAWNER, MOSSY_COBBLESTONE, MYCEL, NETHER_BRICK, NETHER_BRICK_STAIRS, NETHERRACK, NOTE_BLOCK, OBSIDIAN, PACKED_ICE, PUMPKIN, QUARTZ_BLOCK, QUARTZ_ORE, QUARTZ_STAIRS, REDSTONE_BLOCK, SANDSTONE, SAND,
            SANDSTONE_STAIRS, SMOOTH_BRICK, SMOOTH_STAIRS, SNOW_BLOCK, SOUL_SAND, SPONGE, SPRUCE_WOOD_STAIRS, STONE, WOOD, WOOD_STAIRS, WORKBENCH, WOOL, getMaterial(44), getMaterial(126) }));

    public boolean                    AUTO_MERGE;
    public static boolean             AUTO_MERGE_DEFAULT              = false;

    public boolean                    MOB_SPAWNING;
    public static boolean             MOB_SPAWNING_DEFAULT            = false;

    public Biome                      PLOT_BIOME;
    public static Biome               PLOT_BIOME_DEFAULT              = Biome.FOREST;

    public boolean                    PLOT_CHAT;
    public static boolean             PLOT_CHAT_DEFAULT               = false;

    public boolean                    SCHEMATIC_CLAIM_SPECIFY         = false;
    public static boolean             SCHEMATIC_CLAIM_SPECIFY_DEFAULT = false;

    public boolean                    SCHEMATIC_ON_CLAIM;
    public static boolean             SCHEMATIC_ON_CLAIM_DEFAULT      = false;

    public String                     SCHEMATIC_FILE;
    public static String              SCHEMATIC_FILE_DEFAULT          = "null";

    public List<String>               SCHEMATICS;
    public static List<String>        SCHEMATICS_DEFAULT              = null;

    public List<String>               DEFAULT_FLAGS;
    public static List<String>        DEFAULT_FLAGS_DEFAULT           = new ArrayList<String>();

    public boolean                    USE_ECONOMY;
    public static boolean             USE_ECONOMY_DEFAULT             = false;

    public double                     PLOT_PRICE;
    public static double              PLOT_PRICE_DEFAULT              = 100;

    public double                     MERGE_PRICE;
    public static double              MERGE_PRICE_DEFAULT             = 100;

    public double                     SELL_PRICE;
    public static double              SELL_PRICE_DEFAULT              = 75;

    public boolean                    PVP;
    public static boolean             PVP_DEFAULT                     = false;

    public boolean                    PVE;
    public static boolean             PVE_DEFAULT                     = false;

    public boolean                    SPAWN_EGGS;
    public static boolean             SPAWN_EGGS_DEFAULT              = false;

    public boolean                    SPAWN_CUSTOM;
    public static boolean             SPAWN_CUSTOM_DEFAULT            = true;

    public boolean                    SPAWN_BREEDING;
    public static boolean             SPAWN_BREEDING_DEFAULT          = false;

    public PlotWorld(final String worldname) {
        this.worldname = worldname;
    }

    /**
     * When a world is created, the following method will be called for each
     *
     * @param config
     */
    public void loadDefaultConfiguration(final ConfigurationSection config) {
        this.MOB_SPAWNING = config.getBoolean("natural_mob_spawning");
        this.AUTO_MERGE = config.getBoolean("plot.auto_merge");
        this.PLOT_BIOME = (Biome) Configuration.BIOME.parseString(config.getString("plot.biome"));
        this.SCHEMATIC_ON_CLAIM = config.getBoolean("schematic.on_claim");
        this.SCHEMATIC_FILE = config.getString("schematic.file");
        this.SCHEMATIC_CLAIM_SPECIFY = config.getBoolean("schematic.specify_on_claim");
        this.SCHEMATICS = config.getStringList("schematic.schematics");
        this.USE_ECONOMY = config.getBoolean("economy.use");
        this.PLOT_PRICE = config.getDouble("economy.prices.claim");
        this.MERGE_PRICE = config.getDouble("economy.prices.merge");
        this.SELL_PRICE = config.getDouble("economy.prices.sell");
        this.PLOT_CHAT = config.getBoolean("chat.enabled");
        this.DEFAULT_FLAGS = config.getStringList("flags.default");
        this.PVP = config.getBoolean("event.pvp");
        this.PVE = config.getBoolean("event.pve");
        this.SPAWN_EGGS = config.getBoolean("event.spawn.egg");
        this.SPAWN_CUSTOM = config.getBoolean("event.spawn.custom");
        this.SPAWN_BREEDING = config.getBoolean("event.spawn.breeding");
        loadConfiguration(config);
    }

    public abstract void loadConfiguration(final ConfigurationSection config);

    /**
     * Saving core plotworld settings
     *
     * @param config
     */
    public void saveConfiguration(final ConfigurationSection config) {
        final HashMap<String, Object> options = new HashMap<String, Object>();

        options.put("natural_mob_spawning", PlotWorld.MOB_SPAWNING_DEFAULT);
        options.put("plot.auto_merge", PlotWorld.AUTO_MERGE_DEFAULT);
        options.put("plot.biome", PlotWorld.PLOT_BIOME_DEFAULT.toString());
        options.put("schematic.on_claim", PlotWorld.SCHEMATIC_ON_CLAIM_DEFAULT);
        options.put("schematic.file", PlotWorld.SCHEMATIC_FILE_DEFAULT);
        options.put("schematic.specify_on_claim", PlotWorld.SCHEMATIC_CLAIM_SPECIFY_DEFAULT);
        options.put("schematic.schematics", PlotWorld.SCHEMATICS_DEFAULT);
        options.put("economy.use", PlotWorld.USE_ECONOMY_DEFAULT);
        options.put("economy.prices.claim", PlotWorld.PLOT_PRICE_DEFAULT);
        options.put("economy.prices.merge", PlotWorld.MERGE_PRICE_DEFAULT);
        options.put("economy.prices.sell", PlotWorld.SELL_PRICE_DEFAULT);
        options.put("chat.enabled", PlotWorld.PLOT_CHAT_DEFAULT);
        options.put("flags.default", PlotWorld.DEFAULT_FLAGS_DEFAULT);
        options.put("event.pvp", PlotWorld.PVP_DEFAULT);
        options.put("event.pve", PlotWorld.PVE_DEFAULT);
        options.put("event.spawn.egg", PlotWorld.SPAWN_EGGS_DEFAULT);
        options.put("event.spawn.custom", PlotWorld.SPAWN_CUSTOM_DEFAULT);
        options.put("event.spawn.breeding", PlotWorld.SPAWN_BREEDING_DEFAULT);
        final ConfigurationNode[] settings = getSettingNodes();

        /*
         * Saving generator specific settings
         */
        for (final ConfigurationNode setting : settings) {
            options.put(setting.getConstant(), setting.getType().parseObject(setting.getValue()));
        }

        for (final String option : options.keySet()) {
            if (!config.contains(option)) {
                config.set(option, options.get(option));
            }
        }
    }

    public String worldname;

    /**
     * Used for the <b>/plot setup</b> command Return null if you do not want to
     * support this feature
     *
     * @return ConfigurationNode[]
     */
    public abstract ConfigurationNode[] getSettingNodes();
}