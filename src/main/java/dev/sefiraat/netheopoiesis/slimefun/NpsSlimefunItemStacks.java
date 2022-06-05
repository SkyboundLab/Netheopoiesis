package dev.sefiraat.netheopoiesis.slimefun;

import dev.sefiraat.netheopoiesis.utils.Skulls;
import dev.sefiraat.netheopoiesis.utils.Theme;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import org.bukkit.Material;

import javax.annotation.Nonnull;
import java.util.stream.Stream;

public class NpsSlimefunItemStacks {

    private NpsSlimefunItemStacks() {
        throw new IllegalStateException("Utility class");
    }

    // Crafting

    // Tools
    public static final SlimefunItemStack CRUDE_HARVESTING_TOOL;
    public static final SlimefunItemStack HARVESTING_TOOL;
    public static final SlimefunItemStack PURIFICATION_BAROMETER;

    // Seeds
    // Main
    public static final SlimefunItemStack PURIFICATION_SEED;
    public static final SlimefunItemStack SOUL_SEED;
    public static final SlimefunItemStack SPIRIT_SEED;

    // First Stage
    public static final SlimefunItemStack SPINDLE_SEED;
    public static final SlimefunItemStack GRAINY_SEED;
    public static final SlimefunItemStack STRINGY_SEED;
    public static final SlimefunItemStack STONEY_SEED;
    public static final SlimefunItemStack DUSTY_SEED;
    public static final SlimefunItemStack SEASIDE_SEED;
    public static final SlimefunItemStack MOLDABLE_SEED;
    public static final SlimefunItemStack SPLINTERED_SEED;
    public static final SlimefunItemStack ROTTEN_SEED;

    // Second Stage
    public static final SlimefunItemStack METALLIC_SEED;
    public static final SlimefunItemStack SHINY_SEED;
    public static final SlimefunItemStack SMOOTH_SEED;
    public static final SlimefunItemStack ENCHANTED_SEED;
    public static final SlimefunItemStack COMBUSTIBLE_SEED;
    public static final SlimefunItemStack PROTECTIVE_SEED;
    public static final SlimefunItemStack VALUABLE_SEED;
    public static final SlimefunItemStack PERFECTION_SEED;

    // Third Stage
    public static final SlimefunItemStack OAKENDRAN_SEED;

    // Crux'
    public static final SlimefunItemStack BASIC_PURIFIED_NETHERRACK;
    public static final SlimefunItemStack PURIFIED_NETHERRACK;
    public static final SlimefunItemStack VORACIOUS_DIRT;
    public static final SlimefunItemStack NETHER_DIRT;
    public static final SlimefunItemStack NETHER_GRASS;

    static {

        // region Crafting

        // endregion

        // region Tools

        CRUDE_HARVESTING_TOOL = Theme.themedSlimefunItemStack(
            "NPS_CRUDE_HARVESTING_TOOL",
            Material.PRISMARINE_SHARD,
            Theme.TOOL,
            "Crude Harvesting Tool",
            "This tool will harvest plants",
            "where possible.",
            "This one is very shoddy and won't",
            "last long",
            "",
            LoreBuilder.usesLeft(25)
        );

        HARVESTING_TOOL = Theme.themedSlimefunItemStack(
            "NPS_HARVESTING_TOOL",
            Material.PRISMARINE_SHARD,
            Theme.TOOL,
            "Harvesting Tool",
            "This tool will harvest plants",
            "where possible.",
            "This one is sturdier but still won't",
            "last long",
            "",
            LoreBuilder.usesLeft(150)
        );

        PURIFICATION_BAROMETER = Theme.themedSlimefunItemStack(
            "NPS_PURIFICATION_BAROMETER",
            Material.CLOCK,
            Theme.TOOL,
            "Purification Barometer",
            "When used, this tool will tell you",
            "how purified the current chunk is."
        );

        // endregion

        // region Seeds

        PURIFICATION_SEED = Theme.themedSeed(
            "NPS_PURIFICATION_SEED",
            Skulls.SEED_BLUE.getPlayerHead(),
            Theme.SEED,
            "Purification Seed",
            new String[]{"This seed, when fully grown,", "will slowly purify surrounding", "blocks."},
            getCanBePlacedOnLore("Netherrack", "Warped Nylium", "Crimson Nylium")
        );

        SOUL_SEED = Theme.themedSeed(
            "NPS_SOUL_SEED",
            Skulls.SEED_BLUE.getPlayerHead(),
            Theme.SEED,
            "Soul Seed",
            new String[]{"This seed, when fully grown,", "will further push the purification", "process of nearby blocks."},
            getCanBePlacedOnLore("Basic Purified Netherrack (or better)")
        );

        SPIRIT_SEED = Theme.themedSeed(
            "NPS_SPIRIT_SEED",
            Skulls.SEED_BLUE.getPlayerHead(),
            Theme.SEED,
            "Sprit Seed",
            new String[]{"This seed, when fully grown,", "will allow an even deeper purification", "for nearby blocks."},
            getCanBePlacedOnLore("Purified Netherrack (or better)")
        );

        SPINDLE_SEED = Theme.themedSeed(
            "NPS_SPINDLE_SEED",
            Skulls.SEED_ORANGE.getPlayerHead(),
            Theme.SEED,
            "Spindle Seed",
            new String[]{"This seed, when fully grown,", "will grow it's roots out which", "can be harvested."},
            getCanBePlacedOnLore("Basic Purified Netherrack (or better)")
        );

        GRAINY_SEED = Theme.themedSeed(
            "NPS_GRAINY_SEED",
            Skulls.SEED_RED.getPlayerHead(),
            Theme.SEED,
            "Grainy Seed",
            new String[]{"This seed, when fully grown,", "will slowly drop powder nearby", "which can be picked up."},
            getCanBePlacedOnLore("Basic Purified Netherrack (or better)")
        );

        STRINGY_SEED = Theme.themedSeed(
            "NPS_STRINGY_SEED",
            Skulls.SEED_GREEN.getPlayerHead(),
            Theme.SEED,
            "Stringy Seed",
            new String[]{"This seed, when fully grown,", "will slowly envelop the nearby", "area in a stringy substance."},
            getCanBePlacedOnLore("Basic Purified Netherrack (or better)")
        );

        STONEY_SEED = Theme.themedSeed(
            "NPS_STONEY_SEED",
            Skulls.SEED_VIOLET.getPlayerHead(),
            Theme.SEED,
            "Stoney Seed",
            new String[]{"This seed, when fully grown,", "will slowly produce small amounts of", "cobblestone."},
            getCanBePlacedOnLore("Basic Purified Netherrack (or better)")
        );

        DUSTY_SEED = Theme.themedSeed(
            "NPS_DUSTY_SEED",
            Skulls.SEED_INDIGO.getPlayerHead(),
            Theme.SEED,
            "Dusty Seed",
            new String[]{"This seed, when fully grown,", "can be harvested with a tool for", "gravel."},
            getCanBePlacedOnLore("Basic Purified Netherrack (or better)")
        );

        SEASIDE_SEED = Theme.themedSeed(
            "NPS_SEASIDE_SEED",
            Skulls.SEED_YELLOW.getPlayerHead(),
            Theme.SEED,
            "Seaside Seed",
            new String[]{"This seed, when fully grown,", "can be harvested with a tool for", "sand."},
            getCanBePlacedOnLore("Basic Purified Netherrack (or better)")
        );

        MOLDABLE_SEED = Theme.themedSeed(
            "NPS_MOLDABLE_SEED",
            Skulls.SEED_VIOLET.getPlayerHead(),
            Theme.SEED,
            "Moldable Seed",
            new String[]{"This seed, when fully grown,", "can be harvested with a tool for", "clay balls."},
            getCanBePlacedOnLore("Basic Purified Netherrack (or better)")
        );

        SPLINTERED_SEED = Theme.themedSeed(
            "NPS_SPLINTERED_SEED",
            Skulls.SEED_GREEN.getPlayerHead(),
            Theme.SEED,
            "Splintered Seed",
            new String[]{"This seed, when fully grown,", "will sometimes cause skeletons to", "spawn in the surrounding area."},
            getCanBePlacedOnLore("Basic Purified Netherrack (or better)")
        );

        ROTTEN_SEED = Theme.themedSeed(
            "NPS_ROTTEN_SEED",
            Skulls.SEED_GREEN.getPlayerHead(),
            Theme.SEED,
            "Rotten Seed",
            new String[]{"This seed, when fully grown,", "will sometimes cause zombies to", "spawn in the surrounding area."},
            getCanBePlacedOnLore("Basic Purified Netherrack (or better)")
        );

        METALLIC_SEED = Theme.themedSeed(
            "NPS_METALLIC_SEED",
            Skulls.SEED_GREEN.getPlayerHead(),
            Theme.SEED,
            "Metallic Seed",
            new String[]{"This seed, when fully grown,", "can be harvested with a tool for", "iron nuggets."},
            getCanBePlacedOnLore("Purified Netherrack (or better)")
        );

        SHINY_SEED = Theme.themedSeed(
            "NPS_SHINY_SEED",
            Skulls.SEED_YELLOW.getPlayerHead(),
            Theme.SEED,
            "Shiny Seed",
            new String[]{"This seed, when fully grown,", "can be harvested with a tool for", "gold nuggets."},
            getCanBePlacedOnLore("Purified Netherrack (or better)")
        );

        SMOOTH_SEED = Theme.themedSeed(
            "NPS_SMOOTH_SEED",
            Skulls.SEED_VIOLET.getPlayerHead(),
            Theme.SEED,
            "Smooth Seed",
            new String[]{"This seed, when fully grown,", "can be harvested with a tool for", "amethyst shards."},
            getCanBePlacedOnLore("Purified Netherrack (or better)")
        );

        ENCHANTED_SEED = Theme.themedSeed(
            "NPS_ENCHANTED_SEED",
            Skulls.SEED_BLUE.getPlayerHead(),
            Theme.SEED,
            "Enchanted Seed",
            new String[]{"This seed, when fully grown,", "can be harvested with a tool for", "lapis lazuli."},
            getCanBePlacedOnLore("Purified Netherrack (or better)")
        );

        COMBUSTIBLE_SEED = Theme.themedSeed(
            "NPS_COMBUSTABLE_SEED",
            Skulls.SEED_INDIGO.getPlayerHead(),
            Theme.SEED,
            "Combustable Seed",
            new String[]{"This seed, when fully grown,", "can be harvested with a tool for", "coal."},
            getCanBePlacedOnLore("Purified Netherrack (or better)")
        );

        PROTECTIVE_SEED = Theme.themedSeed(
            "NPS_PROTECTIVE_SEED",
            Skulls.SEED_YELLOW.getPlayerHead(),
            Theme.SEED,
            "Protective Seed",
            new String[]{"This seed, when fully grown,", "will spawn protective iron golems."},
            getCanBePlacedOnLore("Purified Netherrack (or better)")
        );

        VALUABLE_SEED = Theme.themedSeed(
            "NPS_VALUABLE_SEED",
            Skulls.SEED_GREEN.getPlayerHead(),
            Theme.SEED,
            "Valuable Seed",
            new String[]{"This seed, when fully grown,", "can be harvested with a tool for", "emeralds."},
            getCanBePlacedOnLore("Purified Netherrack (or better)")
        );

        PERFECTION_SEED = Theme.themedSeed(
            "NPS_PERFECTION_SEED",
            Skulls.SEED_BLUE.getPlayerHead(),
            Theme.SEED,
            "Perfection Seed",
            new String[]{"This seed, when fully grown,", "can be harvested with a tool for", "diamonds."},
            getCanBePlacedOnLore("Purified Netherrack (or better)")
        );

        OAKENDRAN_SEED = Theme.themedSeed(
            "NPS_OAKENDRAN_SEED",
            Skulls.SEED_ORANGE.getPlayerHead(),
            Theme.SEED,
            "Oakendran Seed",
            new String[]{"This seed, when fully grown,", "may cause trees to spontaneously", "grow."},
            getCanBePlacedOnLore("Purified Netherrack (or better)")
        );

        // endregion

        // region Crux'

        BASIC_PURIFIED_NETHERRACK = Theme.themedSlimefunItemStack(
            "NPS_BASIC_PURIFIED_NETHERRACK",
            Material.MYCELIUM,
            Theme.CRUX,
            "Basic Purified Netherrack",
            "This Netherrack has been purified",
            "to allow more complex seeds to",
            "be grown on it."
        );

        PURIFIED_NETHERRACK = Theme.themedSlimefunItemStack(
            "NPS_PURIFIED_NETHERRACK",
            Material.PODZOL,
            Theme.CRUX,
            "Purified Netherrack",
            "This Netherrack has been purified",
            "to allow more complex seeds to",
            "be grown on it."
        );

        VORACIOUS_DIRT = Theme.themedSlimefunItemStack(
            "NPS_VORACIOUS_DIRT",
            Material.ROOTED_DIRT,
            Theme.CRUX,
            "Voracious Dirt",
            "The Netherrack has been purified to",
            "a point in which it is a viable soil."
        );

        NETHER_DIRT = Theme.themedSlimefunItemStack(
            "NPS_NETHER_DIRT",
            Material.DIRT,
            Theme.CRUX,
            "Nether Dirt",
            "The Netherrack has been purified to",
            "a point in which it is a good soil."
        );

        NETHER_GRASS = Theme.themedSlimefunItemStack(
            "NPS_NETHER_GRASS",
            Material.GRASS_BLOCK,
            Theme.CRUX,
            "Nether Grass",
            "This grass is positively healthy."
        );

        // endregion
    }

    @Nonnull
    public static String[] getCanBePlacedOnLore(@Nonnull String... validPlacements) {
        String[] strings = new String[]{
            "",
            Theme.CRUX + "Can be grown on:"
        };
        return Stream.of(strings, validPlacements).flatMap(Stream::of).toArray(String[]::new);
    }
}
