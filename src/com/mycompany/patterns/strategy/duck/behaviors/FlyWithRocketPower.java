package com.mycompany.patterns.strategy.duck.behaviors;

public class FlyWithRocketPower implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("fly with rocket power ");
	}

}
