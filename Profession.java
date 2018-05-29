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
public enum Profession {
	
	HUNTER,
	GATHERER;
	
	private static final List<Profession> VALUES =
		    Collections.unmodifiableList(Arrays.asList(values()));
	
	private static final int SIZE = VALUES.size();

	/**
	 * Randomly Generates Profession
	 */
	public static Profession findProfession(Random rand)  
	{
		return VALUES.get(rand.nextInt(SIZE));
	}
	
	
	public static String professionDescription (Profession input)
	{
		
		switch(input)
		{
		case HUNTER:
			return "Hunter";

		case GATHERER:
			return "Gatherer";

		}
		return null;
	}
	
	public static String professionGear (Profession input)
	{
		
		switch(input)
		{
		case HUNTER:
			return "Wood spear (1d5)";

		case GATHERER:
			return "Large leather sack";

		}
		return null;
	}


}
