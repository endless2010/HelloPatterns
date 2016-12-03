package com.mycompany.patterns.strategy.game.characters;

import com.mycompany.patterns.strategy.game.weapons.WeaponBehavior;

public abstract class Characters {
	private WeaponBehavior weapon;
	
	public void fight(){
		System.out.print(this.getClass().getSimpleName()+" ");
		weapon.useWeapon();
	}
	
	public WeaponBehavior getWeapon() {
		return weapon;
	}

	public void setWeapon(WeaponBehavior weapon) {
		this.weapon = weapon;
	}
}
