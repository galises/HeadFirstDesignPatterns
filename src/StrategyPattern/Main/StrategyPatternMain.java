package StrategyPattern.Main;

import StrategyPattern.Behaviors.LegendaryWeaponBehavior;
import StrategyPattern.Characters.Character;
import StrategyPattern.Characters.King;
import StrategyPattern.Characters.Knight;
import StrategyPattern.Characters.Queen;
import StrategyPattern.Characters.Troll;

public class StrategyPatternMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Character character = getCharacter();
		character.fight();
		character.setWeaponBehavior(new LegendaryWeaponBehavior());
		character.fight();
	}
	
	private static Character getCharacter (){
		Character character = new King();
		int randomCharacter = (int) (Math.random() * 10) % 3;
		switch (randomCharacter){
		case 0:
			character = new Troll();
			break;
			
		case 1:
			character = new Queen();
			break;
		
		case 2:
			character = new Knight();
			break;
		}
		return character;
	}
}
