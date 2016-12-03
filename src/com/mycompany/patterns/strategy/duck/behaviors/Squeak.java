package com.mycompany.patterns.strategy.duck.behaviors;

public class Squeak implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("squeak squeak ");
	}

}
