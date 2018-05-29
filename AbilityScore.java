/**
 * 
 */
package org.oldschooladventures.mcc;

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
	
	private String strengthModifier;
	private String agilityModifier;
	private String staminaModifier;
	private String personalityModifier;
	private String intelligenceModifier;
	private String luckModifier;
	
	private int numbericStrengthMod;
	private int numbericAgilityMod;
	private int numbericStaminaMod;
	private int numbericPersonalityMod;
	private int numbericIntelligenceMod;
	private int numbericLuckMod;
	
	
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
		
		numbericStrengthMod = numbericAbilityModifier(strengthModifier);
		numbericAgilityMod = numbericAbilityModifier(agilityModifier);
		numbericStaminaMod = numbericAbilityModifier(staminaModifier);
		numbericPersonalityMod = numbericAbilityModifier(personalityModifier);
		numbericIntelligenceMod = numbericAbilityModifier(intelligenceModifier);
		numbericLuckMod = numbericAbilityModifier(luckModifier);
		
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

	public String getStrengthModifier() {
		return strengthModifier;
	}

	public String getAgilityModifier() {
		return agilityModifier;
	}

	public String getStaminaModifier() {
		return staminaModifier;
	}

	public String getPersonalityModifier() {
		return personalityModifier;
	}

	public String getIntelligenceModifier() {
		return intelligenceModifier;
	}

	public String getLuckModifier() {
		return luckModifier;
	}

	public int getNumbericStrengthMod() {
		return numbericStrengthMod;
	}

	public int getNumbericAgilityMod() {
		return numbericAgilityMod;
	}

	public int getNumbericStaminaMod() {
		return numbericStaminaMod;
	}

	public int getNumbericPersonalityMod() {
		return numbericPersonalityMod;
	}

	public int getNumbericIntelligenceMod() {
		return numbericIntelligenceMod;
	}

	public int getNumbericLuckMod() {
		return numbericLuckMod;
	}


	
	
	
	
	
	
	
	
	
	

}
