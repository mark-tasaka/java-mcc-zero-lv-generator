package org.oldschooladventures.mcc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author Mark Tasaka
 * Mutant Crawl Classics Zero-Level Character Generator
 * Version 1.01
 * May 28, 2018
 */
public enum BirthAugur {
	
	NUCLEAR_WINTER,
	ROXEN,
	TRIFFID,
	BEAST,
	MILLISTEED,
	APOCALYPSE,
	RAGNAROK,
	REVELATIONS,
	HUNTER,
	GATHERER,
	OUTSIDER,
	SENSOR,
	GENOMORPH,
	ALPHA_STRIKER,
	PROGRAMMER,
	HYPOSPRAY,
	SURVIVOR,
	MULTITOOL,
	HEALER,
	SCIENTIST,
	GLOW,
	ESPER,
	BUNKER,
	CPU,
	ECOBOT,
	WAR_BOT,
	UNCHANGING,
	BACKUP_DISK,
	UNIVERSAL_TRANSLATOR,
	ACCELERANT;
	
	private static final List<BirthAugur> VALUES =
		    Collections.unmodifiableList(Arrays.asList(values()));
	
	private static final int SIZE = VALUES.size();

	/**
	 * Randomly Generates the BirthAugur
	 */
	public static BirthAugur birthSign(Random rand)  
	{
		return VALUES.get(rand.nextInt(SIZE));
	}

	
	public static String augurDescription (BirthAugur description)
	{
		
		switch(description)
		{
		case NUCLEAR_WINTER:
			return "Nuclear Winter: All attack rolls";

		case ROXEN:
			return "The Roxen: All melee attack rolls";

		case TRIFFID:
			return "The Triffid: Missle fire attack rolls";

		case BEAST:
			return "The Beast: Unarmed attack rolls";

		case MILLISTEED:
			return "The Millisteed: Mounted attack rolls";

		case APOCALYPSE:
			return "The Apocalypse: All damage rolls";

		case RAGNAROK:
			return "Ragnarok: Melee damage rolls";

		case REVELATIONS:
			return "Revelations: Missle damage rolls";
			
		case HUNTER:
			return "The Hunter: Attack & damage rolls 0-level starting weapons";
		
		case GATHERER:
			return "The Gatherer: Stealth/hiding rolls";
		
		case OUTSIDER:
			return "The Outsider: Find/disable traps";		
			
		case SENSOR:
			return "The Sensor: Find secret doors";		
			
		case GENOMORPH:
			return "The Genomorph: Mutation checks";		
			
		case ALPHA_STRIKER:
			return "The Alpha Striker: Mutation damage rolls";		
			
		case PROGRAMMER:
			return "The Programmer: AI recognition rolls";		
			
		case HYPOSPRAY:
			return "The Hypospray: Healing rolls";		
			
		case SURVIVOR:
			return "The Survivor: All Saving throws";		
			
		case MULTITOOL:
			return "The Multitool: Escape traps";		
			
		case HEALER:
			return "The Healer: Saving throws against poison";		
			
		case SCIENTIST:
			return "The Scientist: Reflex saving throws";		
			
		case GLOW:
			return "The Glow: Fortitude saving throws";		
			
		case ESPER:
			return "The Esper: Willpower saving throws";		
			
		case BUNKER:
			return "The Bunker: Armour class";		
			
		case CPU:
			return "The CPU: Initiative";		
			
		case ECOBOT:
			return "The Ecobot: Hits points/each level";		
			
		case WAR_BOT:
			return "The War-Bot: Critical hit tables (double luck mod)";		
			
		case UNCHANGING:
			return "The Unchanging: Defect rolls";		
			
		case BACKUP_DISK:
			return "The Backup Disk: Fumbles (double luck mod)";		
			
		case UNIVERSAL_TRANSLATOR:
			return "The Universal Translator: Number of Languages";		
			
		case ACCELERANT:
			return "The Accelerant: Speed";

		}
		return null;
	}
	
}
