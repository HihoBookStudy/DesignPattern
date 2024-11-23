package main.chapter1.after.implement;

import main.chapter1.after.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I Can't Fly");
	}

}
