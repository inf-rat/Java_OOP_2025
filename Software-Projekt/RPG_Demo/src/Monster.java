public class Monster extends Creature {

    public Monster(int level) {
        super(level);
        randomName();
    }

    @Override
    public int attack() {
        return super.getStrength() + Gameplay.diceRoll(20);
    }

    @Override
    public String fightingStyle() {
        return "with bare hands";
    }

    public void randomName() {
        String[] MONSTER_NAMES = {
                "Morgul Shadowspawn",
                "Dreadmist Wraith",
                "Soulbane Harbinger",
                "Netherflame Revenant",
                "Grimshade Specter",
                "Darkheart Lurker",
                "Doomgloom Gargoyle",
                "Abyssal Dreadstalker",
                "Shadowthorn Necrofiend",
                "Cursedblood Nightfiend",
                "Ghoulbane Hellspawn",
                "Dreadspire Demon",
                "Abyssal Shadowmancer",
                "Soulthirst Banshee",
                "Ebonfire Warlock",
                "Cryptshade Phantom",
                "Netherbane Shadowfiend",
                "Frostbite Wight",
                "Bloodmoon Enchantress",
                "Abyssal Doomlord",
                "Necrosoul Reaver",
                "Dreadflame Warfiend",
                "Voidspawn Marauder",
                "Darksteel Hellhound",
                "Cryptstalker Shade",
                "Eldritch Deathshade",
                "Venomspire Gorgon",
                "Bonechill Nightstalker",
                "Gloomheart Siren",
                "Abyssal Dreadfiend",
                "Necroshade Warlock",
                "Doomfire Revenant",
                "Dreadcloak Specter",
                "Eclipse Shadowmancer",
                "Malevolence Banshee",
                "Netherscar Demon",
                "Darkbane Harbinger",
                "Cryptborn Lich",
                "Dreadflame Warlock",
                "Bloodthirsty Succubus",
                "Abyssal Reaper",
                "Netherblight Wraith",
                "Shadowspire Necromancer",
                "Ebonclaw Phantom",
                "Grimfrost Abomination",
                "Voidmaw Hellhound",
                "Dreadfang Warfiend",
                "Necrosoul Revenant",
                "Shadowbane Siren",
                "Doomweaver Gargoyle",
                "Abyssal Drakefiend",
                "Cryptstalker Deathshade",
                "Dreadshadow Reaver",
                "Netherflame Hellspawn",
                "Darkhearted Lich",
                "Soulthirst Banshee",
                "Ghoulbane Necrofiend",
                "Eclipse Nightstalker",
                "Netherscar Harbinger",
                "Voidspawn Wight",
                "Bloodmoon Enchantress",
                "Abyssal Doomlord",
                "Necroshade Warfiend",
                "Dreadflame Warlock",
                "Cryptspire Phantom",
                "Ebonfire Gorgon",
                "Grimshade Specter",
                "Shadowthorn Harbinger",
                "Doomgloom Wight",
                "Abyssal Deathfiend",
                "Netherbane Shadowmancer",
                "Soulbane Revenant",
                "Darkheart Necrofiend",
                "Ghoulbane Wraith",
                "Dreadmist Marauder",
                "Bloodmoon Hellhound",
                "Abyssal Reaper",
                "Shadowspire Abomination",
                "Necrosoul Demon",
                "Eldritch Banshee",
                "Venomspire Warfiend",
                "Bonechill Deathshade",
                "Gloomhearted Phantom",
                "Abyssal Drakefiend",
                "Necroshade Nightstalker",
                "Dreadshadow Warlock",
                "Eclipse Wraith",
                "Voidmaw Harbinger",
                "Doomweaver Lich",
                "Cryptstalker Enchantress",
                "Dreadflame Gorgon",
                "Netherflame Specter",
                "Shadowbane Phantom",
                "Grimshade Warlock",
                "Darkheart Gargoyle",
                "Soulbane Reaver",
                "Netherflame Warfiend",
                "Dreadmist Abomination",
                "Morgul Deathshade"
        };
        int index = Gameplay.diceRoll(MONSTER_NAMES.length) - 1;
        this.setName(MONSTER_NAMES[index]);
    }

    @Override
    public String toString() {
        return "Monster: \t" + getName() + ", Level: " + getLevel() + ", HP: " + getHitPoints() + ", Str: "
                + getStrength();
    }
}
