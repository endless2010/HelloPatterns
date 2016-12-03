package com.mycompany.patterns.strategy.duck.behaviors;

public class MuteQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("silence ");
	}

}
