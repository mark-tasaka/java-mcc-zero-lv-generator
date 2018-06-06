/**
 * 
 */
package mutantCrawlClassicsZeroLvGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * @author Mark Tasaka
 * Mutant Crawl Classics Zero-Level Character Generator
 * Version 1.01
 * May 28, 2018
 */
public abstract class Parent implements Grandparent {
	
	public int rollDice(int numberOfSides, int numberOfDiceRolled, 
			int numberOfDiceRemoved, int baseValue) {
		
		Random rand = new Random();
		
		if(numberOfSides <=2 || numberOfSides >=20){
			numberOfSides = 6;
		}
		
		if(numberOfDiceRolled < 0){
			numberOfDiceRolled =3;
		}
		
		if(numberOfDiceRemoved >= numberOfDiceRolled){
			numberOfDiceRemoved =0;
		}
		
		if(baseValue < 0){
			baseValue = 0;
		}
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		

		for(int i = 0; i < numberOfDiceRolled; i++){
			numbers.add(rand.nextInt(numberOfSides)+1);
		}
		
		for(int i = 0; i < numberOfDiceRemoved; i++){
			numbers.remove(Collections.min(numbers));
		}
		
		int sum = 0;
			
		for(int i =0; i < numbers.size(); i++){
			sum += numbers.get(i);
		}
			
		return sum + baseValue;
	}
	
	public String abilityModifier (final int abilityScore)
	{
		String modifer = null;
		
		if(abilityScore == 3)
		{
			modifer = "-3";
		}
		else if(abilityScore >= 4 && abilityScore <=5)
		{
			modifer = "-2";
		}
		else if(abilityScore >= 6 && abilityScore <=8)
		{
			modifer = "-1";
		}
		else if(abilityScore >= 9 && abilityScore <=12)
		{
			modifer = "+0";
		}
		else if(abilityScore >= 13 && abilityScore <=15)
		{
			modifer = "+1";
		}
		else if(abilityScore >= 16 && abilityScore <=17)
		{
			modifer = "+2";
		}
		else if(abilityScore == 18)
		{
			modifer = "+3";
		}
		else
		{
			modifer = "Error";
		}
		
		return modifer;
	}
	
	public int numbericAbilityModifier (final String abilityMod)
	{
		int modifer = -4;
		
		if(abilityMod == "-3")
		{
			modifer = -3;
		}
		else if(abilityMod == "-2")
		{
			modifer = -2;
		}
		else if(abilityMod == "-1")
		{
			modifer = -1;
		}
		else if(abilityMod == "+0")
		{
			modifer = 0;
		}
		else if(abilityMod == "+1")
		{
			modifer = 1;
		}
		else if(abilityMod == "+2")
		{
			modifer = 2;
		}
		else if(abilityMod == "+3")
		{
			modifer = 3;
		}
		
		return modifer;
	}


}
