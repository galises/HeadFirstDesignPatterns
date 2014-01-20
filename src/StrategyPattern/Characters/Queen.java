package StrategyPattern.Characters;

import StrategyPattern.Behaviors.KnifeBehavior;


public class Queen extends Character {
	
	public Queen() {
		weaponBehavior = new KnifeBehavior();
	}
	
	@Override
	public void fight() {
		System.out.println("Fighting with the Queen");
		weaponBehavior.useWeapon();
	}

}
