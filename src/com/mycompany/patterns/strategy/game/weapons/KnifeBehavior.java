package com.mycompany.patterns.strategy.game.weapons;

public class KnifeBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("use KnifeBehavior");
	}

}
