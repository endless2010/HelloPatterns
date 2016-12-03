package com.mycompany.patterns.strategy.game;

import com.mycompany.patterns.strategy.game.characters.Characters;
import com.mycompany.patterns.strategy.game.characters.Knight;
import com.mycompany.patterns.strategy.game.weapons.AxeBehavior;
import com.mycompany.patterns.strategy.game.weapons.SwordBehavior;

public class Test {
	public static void main(String[] args){
		Characters knight=new Knight();
		knight.setWeapon(new AxeBehavior());
		knight.fight();
		knight.setWeapon(new SwordBehavior());
		knight.fight();
		
	}
}
