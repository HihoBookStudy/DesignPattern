package main.chapter1.after;

import main.chapter1.after.behavior.FlyBehavior;
import main.chapter1.after.behavior.QuackBehavior;

public abstract class ImprovedDuck {

	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;

	public ImprovedDuck() {}

	public abstract void display();

	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quackBehavior.quack();
	}

	public void swim() {
		System.out.println("All ducks can swim");
	}

	public void changeFlyBehavior(FlyBehavior flyBehavior) {
		if(flyBehavior == null) {
			return;
		}
		this.flyBehavior = flyBehavior;
	}

	public void changeQuackBehavior(QuackBehavior quackBehavior) {
		if(quackBehavior == null) {
			return;
		}
		this.quackBehavior = quackBehavior;
	}

}
