/**
 * 
 */
package org.oldschooladventures.mcc;

/**
 * @author Mark Tasaka
 * Mutant Crawl Classics Zero-Level Character Generator
 * Version 1.01
 * May 28, 2018
 */
public interface Grandparent {
	
	public abstract int rollDice(int numberOfSides, int numberOfDiceRolled, 
			int numberOfDiceRemoved, int baseValue);
	
	public abstract String abilityModifier (final int abilityScore);
	
	public abstract int numbericAbilityModifier (final String abilityMod);
	
	//public abstract int test();

}
