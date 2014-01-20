package StrategyPattern.Characters;

import StrategyPattern.Behaviors.SwordBehavior;

public class King extends Character {

	public King () {
		weaponBehavior = new SwordBehavior();
	}
	
	@Override
	public void fight() {
		System.out.println("Fighting with the King");
		weaponBehavior.useWeapon();
	}

}
