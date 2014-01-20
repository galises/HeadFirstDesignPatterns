package StrategyPattern.Behaviors;

public class SwordBehavior implements WeaponBehavior {
	@Override
	public void useWeapon() {
		System.out.println("Using knife");
	}
}
