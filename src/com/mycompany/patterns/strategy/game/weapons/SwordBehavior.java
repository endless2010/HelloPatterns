package com.mycompany.patterns.strategy.game.weapons;

public class SwordBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("use SwordBehavior");
	}

}
