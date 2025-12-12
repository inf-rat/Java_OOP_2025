public class Weapon {
    private final int level;
    private String name;

    public Weapon(int level, String name) {
        this.level = level;
        this.name = name;
    }

    public Weapon(int level) {
        this.level = level;
        randomName();
    }

    public int getLevel() {
        return level;
    }

    public int getStrength() {
        return (int) Math.round(10.0 * Math.sqrt(level));
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Weapon: \t" + getName() + ", Level: " + getLevel() + ", WpStr: " + getStrength();
    }

    public void randomName() {
        String[] WEAPON_NAMES = {
                "Shadowstrike Dagger",
                "Doombringer Sword",
                "Frostbite Lance",
                "Soulreaper Scythe",
                "Dragonbane Axe",
                "Voidforged Mace",
                "Stormcaller Bow",
                "Darkfire Crossbow",
                "Venomous Whip",
                "Thunderstorm Hammer",
                "Icebound Spear",
                "Eclipsed Katana",
                "Serpentfang Dagger",
                "Hellfire Flail",
                "Bloodthirst Blade",
                "Celestial Scepter",
                "Dreadnova Halberd",
                "Netherflame Scimitar",
                "Abyssal Trident",
                "Silvermoon Rapier",
                "Windwalker Staff",
                "Moonshadow Dagger",
                "Obsidian Cleaver",
                "Spectral Saber",
                "Thunderclap Warhammer",
                "Frostforged Greatsword",
                "Doomcaster Staff",
                "Soulshard Bow",
                "Dragonheart Spear",
                "Voidrender Dagger",
                "Stormforged Waraxe",
                "Darkmoon Crossbow",
                "Venomstrike Whip",
                "Shadowstorm Mace",
                "Frostbite Dagger",
                "Soulthirst Scythe",
                "Dragonwrath Axe",
                "Voidcaller Mace",
                "Stormbringer Bow",
                "Darkbane Crossbow",
                "Venomspine Whip",
                "Thunderfury Hammer",
                "Icebane Spear",
                "Ebonblade Katana",
                "Serpentshadow Dagger",
                "Hellforge Flail",
                "Bloodmoon Blade",
                "Celestial Wand",
                "Dreadblade Halberd",
                "Netherbane Scimitar",
                "Abyssal Halberd",
                "Silverlight Rapier",
                "Windchaser Staff",
                "Moonblade Dagger",
                "Obsidian Edge",
                "Spectral Cutter",
                "Thunderstrike Warhammer",
                "Frostwind Greatsword",
                "Doomforged Staff",
                "Soulquiver Bow",
                "Dragonstrike Spear",
                "Voidstorm Dagger",
                "Stormrender Waraxe",
                "Darkshade Crossbow",
                "Venombite Whip",
                "Shadowflame Mace",
                "Frostshard Dagger",
                "Soulrend Scythe",
                "Dragonclaw Axe",
                "Voidblade Mace",
                "Stormshadow Bow",
                "Darkfury Crossbow",
                "Venomfang Whip",
                "Thunderheart Hammer",
                "Icefury Spear",
                "Eclipsed Blade",
                "Serpentbite Dagger",
                "Hellshadow Flail",
                "Bloodforge Blade",
                "Celestial Blade",
                "Dreadstorm Halberd",
                "Netherstorm Scimitar",
                "Abyssal Spear",
                "Silverstrike Rapier",
                "Windwhisper Staff",
                "Moonshadow Blade",
                "Obsidian Claw",
                "Spectral Blade",
                "Thunderfrost Warhammer",
                "Frostbite Greatsword",
                "Doomshard Staff",
                "Soulstorm Bow",
                "Dragonfury Spear",
                "Voidbringer Dagger",
                "Stormslayer Waraxe",
                "Darkflame Crossbow",
                "Venomheart Whip",
                "Shadowfrost Mace"
        };
        int index = Gameplay.diceRoll(WEAPON_NAMES.length) - 1;
        this.name = WEAPON_NAMES[index];
    }
}
