/**
 * 
 */
package mutantCrawlClassicsZeroLvGenerator;

/**
 * @author Mark Tasaka
 *
 */
public class AbilityScore extends Parent {
	
	private int diceType;
	private int numberOfDice;
	private int numberOfDiceRemoved;
	private int valueAddedtoRoll;
	
	private int strength;
	private int agility;
	private int stamina;
	private int personality;
	private int intelligence;
	private int luck;
	

	private int strengthModifier;
	private int agilityModifier;
	private int staminaModifier;
	private int personalityModifier;
	private int intelligenceModifier;
	protected int luckModifier;
	
	
	public AbilityScore(final int type, final int dieTotal, final int dieRemoved, final int addValue)
	{
		
		diceType = type;
		numberOfDice = dieTotal;
		numberOfDiceRemoved = dieRemoved;
		valueAddedtoRoll = addValue;
		
		strength = rollDice(diceType, numberOfDice, numberOfDiceRemoved, valueAddedtoRoll);
		agility = rollDice(diceType, numberOfDice, numberOfDiceRemoved, valueAddedtoRoll);
		stamina = rollDice(diceType, numberOfDice, numberOfDiceRemoved, valueAddedtoRoll);
		personality = rollDice(diceType, numberOfDice, numberOfDiceRemoved, valueAddedtoRoll);
		intelligence = rollDice(diceType, numberOfDice, numberOfDiceRemoved, valueAddedtoRoll);
		luck = rollDice(diceType, numberOfDice, numberOfDiceRemoved, valueAddedtoRoll);
		
		strengthModifier = abilityModifier(strength);
		agilityModifier = abilityModifier(agility);
		staminaModifier = abilityModifier(stamina);
		personalityModifier = abilityModifier(personality);
		intelligenceModifier = abilityModifier(intelligence);
		luckModifier = abilityModifier(luck);
		
		
	}
	
	public int getDiceType() {
		return diceType;
	}
	public void setDiceType(int diceType) {
		this.diceType = diceType;
	}
	public int getNumberOfDice() {
		return numberOfDice;
	}
	public void setNumberOfDice(int numberOfDice) {
		this.numberOfDice = numberOfDice;
	}
	public int getNumberOfDiceRemoved() {
		return numberOfDiceRemoved;
	}
	public void setNumberOfDiceRemoved(int numberOfDiceRemoved) {
		this.numberOfDiceRemoved = numberOfDiceRemoved;
	}
	public int getValueAddedtoRoll() {
		return valueAddedtoRoll;
	}
	public void setValueAddedtoRoll(int valueAddedtoRoll) {
		this.valueAddedtoRoll = valueAddedtoRoll;
	}


	public int getStrength() {
		return strength;
	}

	public int getAgility() {
		return agility;
	}

	public int getStamina() {
		return stamina;
	}

	public int getPersonality() {
		return personality;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public int getLuck() {
		return luck;
	}

	public int getStrengthModifier() {
		return strengthModifier;
	}

	public int getAgilityModifier() {
		return agilityModifier;
	}

	public int getStaminaModifier() {
		return staminaModifier;
	}

	public int getPersonalityModifier() {
		return personalityModifier;
	}

	public int getIntelligenceModifier() {
		return intelligenceModifier;
	}

	public int getLuckModifier() {
		return luckModifier;
	}



	

}
