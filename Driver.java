/**
 * 
 */
package mutantCrawlClassicsZeroLvGenerator;

/**
 * @author Mark Tasaka
 * Mutant Crawl Classics Zero-Level Character Generator
 * Version 1.01
 * May 28, 2018
 */
public class Driver {

	/**
	 * @param argv - main method, program entry
	 */
	public static void main(final String[] argv) {
		
		DependantStatistic character = new DependantStatistic(6, 3, 0, 0);
		

		System.out.println("Base AC: " + 
		character.generateBaseArmourClass(character.getNumbericAgilityMod()) );
		
		System.out.println("Hit Points: " + 
		character.generateHitPoints(character.getNumbericStaminaMod()));

		System.out.println("Profession: " + 
		character.getProfessionDescription());
		
		System.out.println("\nStrength: " + character.getStrength() + 
				" (" + character.getStrengthModifier() + ")");
		System.out.println("Agility: " + character.getAgility() + 
				" (" + character.getAgilityModifier() + ")");
		System.out.println("Stamina: " + character.getStamina() + 
				" (" + character.getStaminaModifier() + ")");
		System.out.println("Personality: " + character.getPersonality() + 
				" (" + character.getPersonalityModifier() + ")");
		System.out.println("Intelligence: " + character.getIntelligence() + 
				" (" + character.getIntelligenceModifier() + ")");
		System.out.println("Luck: " + character.getLuck() + 
				" (" + character.getLuckModifier() + ")");
		
		System.out.println("\nReflex Save: " + character.getReflexSave());
		System.out.println("Fort Save: " + character.getFortSave());
		System.out.println("Will Save: " + character.getReflexSave());

		System.out.println("\nLucky Sign: " + character.getBirthAugurDescription());
		System.out.println("\nEquipment:\n" + character.getProfessionGear() 
		+ "\n" + character.getStartingGear());

	}

}
