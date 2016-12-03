package com.mycompany.patterns.strategy.duck.behaviors;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("i can't fly ");
	}

}
