package StrategyPattern.Characters;

import StrategyPattern.Behaviors.WeaponBehavior;

public abstract class Character {
	
	protected WeaponBehavior weaponBehavior;
	
	public void setWeaponBehavior(WeaponBehavior weaponBehavior){
		this.weaponBehavior = weaponBehavior;
	}
	
	public abstract void fight();
}
