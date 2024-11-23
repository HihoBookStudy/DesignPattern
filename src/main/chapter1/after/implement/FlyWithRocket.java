package main.chapter1.after.implement;

import main.chapter1.after.behavior.FlyBehavior;

public class FlyWithRocket implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("fly with my rocket");
	}
}
