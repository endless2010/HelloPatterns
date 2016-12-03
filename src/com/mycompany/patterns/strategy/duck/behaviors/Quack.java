package com.mycompany.patterns.strategy.duck.behaviors;

public class Quack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("quack quack ");
	}

}
