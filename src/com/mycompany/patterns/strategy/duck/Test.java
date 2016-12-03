package com.mycompany.patterns.strategy.duck;

import com.mycompany.patterns.strategy.duck.behaviors.FlyWithRocketPower;
import com.mycompany.patterns.strategy.duck.behaviors.FlyWithWings;
import com.mycompany.patterns.strategy.duck.behaviors.Quack;
import com.mycompany.patterns.strategy.duck.ducks.Duck;
import com.mycompany.patterns.strategy.duck.ducks.MallardDuck;

public class Test {
	public static void main(String[] args){
		Duck mallard=new MallardDuck();
		mallard.setQuackBehavior(new Quack());
		mallard.quack();
		mallard.setFlyBehavior(new FlyWithWings());
		mallard.fly();
		mallard.setFlyBehavior(new FlyWithRocketPower());
		mallard.fly();
	}
}
