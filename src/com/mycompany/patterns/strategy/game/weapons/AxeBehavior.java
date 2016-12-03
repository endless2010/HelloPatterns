package com.mycompany.patterns.strategy.game.weapons;

public class AxeBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("use Axe");
	}

}
