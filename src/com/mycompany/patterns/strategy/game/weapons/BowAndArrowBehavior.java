package com.mycompany.patterns.strategy.game.weapons;

public class BowAndArrowBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("use BowAndArrowBehavior");
	}

}
