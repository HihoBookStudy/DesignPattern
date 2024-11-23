package main.chapter1.after;

import main.chapter1.after.behavior.FlyBehavior;
import main.chapter1.after.behavior.QuackBehavior;

public class MallardDuck extends ImprovedDuck{

	public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		super();
		this.flyBehavior = flyBehavior;
		this.quackBehavior = quackBehavior;
	}

	@Override
	public void display() {
		System.out.println("Mallard Duck");
	}
}
