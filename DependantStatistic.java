package mutantCrawlClassicsZeroLvGenerator;

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
	private int reflexSave;
	private int fortSave;
	private int willSave;
	private int initiative;
	
	private BirthAugur luckySign;
	private String birthAugurDescription;
	
	private final Profession randomProfession;
	private String professionDescription;
	private String professionGear;
	
	private final StartingGear randomStartingGear;
	private String startingGear;
	


	Random rand = new Random();
	

	public DependantStatistic(int type, int dieTotal, int dieRemoved, int addValue) 
	{
		super(type, dieTotal, dieRemoved, addValue);
		
		reflexSave = getAgilityModifier() + adjustReflex(luckySign);
		fortSave = getStaminaModifier() + adjustFort(luckySign);
		willSave = getPersonalityModifier() + adjustWill(luckySign);
		initiative = getAgilityModifier() + adjustInit(luckySign);
		
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
		
		int hitPoints = getHitPoints();
		
		if(hitPoints < 1)
		{
			hitPoints = 1;
		}
		
		return hitPoints;
		//return getHitPoints();
	}

	public int getReflexSave() {
		return reflexSave;
	}

	public int getFortSave() {
		return fortSave;
	}

	public int getWillSave() {
		return willSave;
	}

	public int getInitiative() {
		return initiative;
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
	
	/*Add luck modifier to Reflex if Lucky Sign allows*/
	public int adjustReflex(final BirthAugur luckySign)
	{
		int adjustment = 0;
		
		if(luckySign == BirthAugur.SURVIVOR || luckySign == BirthAugur.SCIENTIST)
		{
			adjustment = luckModifier;
		}
		
		return adjustment;
	}
	
	/*Add luck modifier to Fortitude if Lucky Sign allows*/
	public int adjustFort(final BirthAugur luckySign)
	{
		int adjustment = 0;
		
		if(luckySign == BirthAugur.SURVIVOR || luckySign == BirthAugur.GLOW)
		{
			adjustment = luckModifier;
		}
		
		return adjustment;
	}
	
	
	/*Add luck modifier to Will if Lucky Sign allows*/
	public int adjustWill(final BirthAugur luckySign)
	{
		int adjustment = 0;
		
		if(luckySign == BirthAugur.SURVIVOR || luckySign == BirthAugur.ESPER)
		{
			adjustment = luckModifier;
		}
		
		return adjustment;
	}
	
	/*Add luck modifier to Initiative if Lucky Sign allows*/
	public int adjustInit(final BirthAugur luckySign)
	{
		int adjustment = 0;
		
		if(luckySign == BirthAugur.CPU)
		{
			adjustment = getLuckModifier();
		}
		
		return adjustment;
	}

}
