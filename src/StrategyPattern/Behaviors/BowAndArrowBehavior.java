package StrategyPattern.Behaviors;

public class BowAndArrowBehavior implements WeaponBehavior {
	@Override
	public void useWeapon() {
		System.out.println("Using bow and arrow");
	}

}
