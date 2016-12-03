package com.mycompany.patterns.strategy.duck.behaviors;

public class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("fly with wings ");
	}

}
