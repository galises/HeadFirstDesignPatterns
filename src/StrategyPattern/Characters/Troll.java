package StrategyPattern.Characters;

import StrategyPattern.Behaviors.AxeBehavior;

public class Troll extends Character {

	public Troll() {
		weaponBehavior = new AxeBehavior();
	}
	
	@Override
	public void fight() {
		System.out.println("Fighting with the Troll");
		weaponBehavior.useWeapon();
	}

}
