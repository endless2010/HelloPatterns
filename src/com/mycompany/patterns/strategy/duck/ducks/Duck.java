package com.mycompany.patterns.strategy.duck.ducks;

import com.mycompany.patterns.strategy.duck.behaviors.FlyBehavior;
import com.mycompany.patterns.strategy.duck.behaviors.QuackBehavior;

public abstract class Duck {
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;
	
	public abstract void display();
	
	public void fly(){
		flyBehavior.fly();
	}
	
	public void quack(){
		quackBehavior.quack();
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	
}
