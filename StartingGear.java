package org.oldschooladventures.mcc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author Mark Tasaka
 * Mutant Crawl Classics Zero-Level Character Generator
 * Version 1.01
 * May 29, 2018
 */
public enum StartingGear {
	
	BLOWGUN,
	BONE_CLUB,
	BOW,
	FLINT_DAGGER, 
	LEATHER_SLING,
	STONE_AXE,
	SPEAR,
	WOODEN_CLUB, 
	FUR_CLOAK,
	HIDE_ARMOR,
	LEATHER_SHIELD,
	FIRE_STARTER, 
	HEMP_ROPE,
	ROXEN_MEAT,  
	RUCKSACK,
	TORCH,
	ANTLER_HOOD, 
	BONE_NECKLACE,
	CONCH_SHELL,
	MAGIC_STICKY_ROCK,
	PAINTS_AND_DYES,  
	SEA_SHELLS,
	SMALL_SHINY_THING,
	LARGE_SHINY_THING,
	TELEPATHIC_RAT;
	
	private static final List<StartingGear> VALUES =
		    Collections.unmodifiableList(Arrays.asList(values()));
	
	private static final int SIZE = VALUES.size();

	/**
	 * Randomly Generates Profession
	 */
	public static StartingGear findStartingGear(Random rand)  
	{
		return VALUES.get(rand.nextInt(SIZE));
	}
	
	public static String startingGearDescription (StartingGear input)
	{
		
		switch(input)
		{
		case BLOWGUN:
			return "Blowgun and 12 darts (damge: 1d3)";

		case BONE_CLUB:
			return "Bone club (damage: 1d6)";

		case BOW:
			return "Bow and 12 arrows (damage: 1d6)";
			
		case FLINT_DAGGER:
			return "Flint dagger (damage: 1d4)";
			
		case LEATHER_SLING:
			return "Leather sling (damage: 1d4)";
			
		case STONE_AXE:
			return "Stone axe (damage: 1d7)";
			
		case SPEAR:
			return "Stone-tipped spear (damage: 1d6)";
			
		case WOODEN_CLUB:
			return "Wooden club (damage: 1d5)";
			
		case FUR_CLOAK:
			return "Fur cloak (+2 AC)";
			
		case HIDE_ARMOR:
			return "Hide armor (+3 AC)";
			
		case LEATHER_SHIELD:
			return "Leather shield (+1 AC)";
			
		case FIRE_STARTER:
			return "Flint fire starter";
			
		case HEMP_ROPE:
			return "Hemp rope, 50 ft";
			
		case ROXEN_MEAT:
			return "Jerked roxen meat";
			
		case RUCKSACK:
			return "Leather rucksack";
			
		case TORCH:
			return "Torch (x3)";
			
		case ANTLER_HOOD:
			return "Antler hood (+1 AC)";
			
		case BONE_NECKLACE:
			return "Bone necklace";
			
		case CONCH_SHELL:
			return "Conch shell trumpet";
			
		case MAGIC_STICKY_ROCK:
			return "Magic sticky rock (lodestone)";
			
		case PAINTS_AND_DYES:
			return "Paints and dyes";
			
		case SEA_SHELLS:
			return "Bag of sea shells";
			
		case SMALL_SHINY_THING:
			return "Small shiny thing (trinket non-functional artifact)";
			
		case LARGE_SHINY_THING:
			return "Large shiny thing (trinket non-functional artifact)";
			
		case TELEPATHIC_RAT:
			return "A telepathic rat (pet)";


		}
		return null;
	}
	

}
