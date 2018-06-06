package org.oldschooladventures.mcc;

import java.util.Random;

/**
 * @author Mark Tasaka
 * Mutant Crawl Classics Zero-Level Character Generator
 * Version 1.01
 * May 28, 2018
 */
public class DependantStatistic extends AbilityScore {
	
	private int baseArmourClass = 0;
	private int hitPoints;
	private String reflexSave;
	private String fortSave;
	private String willSave;
	
	private BirthAugur luckySign;
	private String birthAugurDescription;
	private Profession randomProfession;
	private String professionDescription;
	private String professionGear;
	
	private StartingGear randomStartingGear;
	private String startingGear;
	


	Random rand = new Random();
	

	public DependantStatistic(int type, int dieTotal, int dieRemoved, int addValue) 
	{
		super(type, dieTotal, dieRemoved, addValue);
		
		reflexSave = getAgilityModifier();
		fortSave = getStaminaModifier();
		willSave = getPersonalityModifier();
		
		luckySign = BirthAugur.birthSign(rand);
		birthAugurDescription = BirthAugur.augurDescription(luckySign);
		
		randomProfession = Profession.findProfession(rand);
		professionDescription = Profession.professionDescription(randomProfession);
		professionGear = Profession.professionGear(randomProfession);
		
		randomStartingGear = StartingGear.findStartingGear(rand);
		startingGear = StartingGear.startingGearDescription(randomStartingGear);
		
		
		
	}

	public void setBaseArmourClass(final int baseArmourClass)
	{
		this.baseArmourClass = baseArmourClass;
	}
	
	public int getBaseArmourClass() {
		return baseArmourClass;
	}
	
	public int generateBaseArmourClass(final int agilityMod)
	{
		setBaseArmourClass(10 + agilityMod);
		return getBaseArmourClass();
		
	}
	
	
	public void setHitPoints(int hitPoints)
	{
		this.hitPoints = hitPoints;
	}

	
	public int getHitPoints() {
		
		return hitPoints;
	}
	
	public int generateHitPoints(final int staminaMod)
	{

		Random rand = new Random();
		
		int hp = rand.nextInt(4) + 1;
		
		setHitPoints(hp + staminaMod);
		
		return getHitPoints();
	}

	public String getReflexSave() {
		return reflexSave;
	}

	public String getFortSave() {
		return fortSave;
	}

	public String getWillSave() {
		return willSave;
	}

	public String getBirthAugurDescription() {
		return birthAugurDescription;
	}


	public BirthAugur getLuckySign() {
		return luckySign;
	}

	public void setLuckySign(BirthAugur luckySign) {
		this.luckySign = luckySign;
	}

	public String getProfessionDescription() {
		return professionDescription;
	}

	public void setProfessionDescription(String professionDescription) {
		this.professionDescription = professionDescription;
	}

	public String getProfessionGear() {
		return professionGear;
	}

	public void setProfessionGear(String professionGear) {
		this.professionGear = professionGear;
	}

	public Profession getRandomProfession() {
		return randomProfession;
	}
	
	
	public StartingGear getRandomStartingGear() {
		return randomStartingGear;
	}

	public String getStartingGear() {
		return startingGear;
	}

	public void setStartingGear(String startingGear) {
		this.startingGear = startingGear;
	}

}
