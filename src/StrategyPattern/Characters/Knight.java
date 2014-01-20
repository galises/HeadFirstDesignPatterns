package StrategyPattern.Characters;

import StrategyPattern.Behaviors.BowAndArrowBehavior;

public class Knight extends Character {

	public Knight () {
		weaponBehavior = new BowAndArrowBehavior();
	}
	
	@Override
	public void fight() {
		System.out.println("Fighting with the Knight");
		weaponBehavior.useWeapon();
	}

}
