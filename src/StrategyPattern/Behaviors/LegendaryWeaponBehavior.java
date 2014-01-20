package StrategyPattern.Behaviors;

public class LegendaryWeaponBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.print("Using LEGENDARY WEAPON");
	}
}
